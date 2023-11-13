CREATE DATABASE empresa;

-- LEVEL 1
-- CRIANDO TABELAS
CREATE TABLE clientes (
    id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(30),
    telefone VARCHAR(15)
);

CREATE TABLE produtos (
    id_produto SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    preco NUMERIC(7, 2),
    categoria VARCHAR(100)
);

CREATE TABLE pedidos (
    id_pedido SERIAL PRIMARY KEY,
    data_pedido DATE,
    valor_total NUMERIC(10, 2),
	id_cliente INT REFERENCES clientes(id_cliente)
);

CREATE TABLE detalhes_do_pedido (
    id_detalhe SERIAL PRIMARY KEY,
    quantidade INT,
	id_pedido INT REFERENCES pedidos(id_pedido),
    id_produto INT REFERENCES produtos(id_produto)
);

-- LEVEL 2
-- POPULANDO AS TABELAS

INSERT INTO clientes (nome, email, telefone) VALUES
    ('João Silva', 'joao@email.com', '123456789'),
    ('Maria Santos', 'maria@email.com', '987654321'),
    ('Pedro Alves', 'pedro@email.com', '456123789'),
    ('Ana Oliveira', 'ana@email.com', '321654987'),
    ('Carlos Souza', 'carlos@email.com', '654987321');

INSERT INTO produtos (nome, preco, categoria) VALUES
    ('Camisa', 29.99, 'Vestuário'),
    ('Calça', 49.99, 'Vestuário'),
    ('Tênis', 79.99, 'Calçados'),
    ('Mesa', 99.99, 'Móveis'),
    ('Cadeira', 39.99, 'Móveis');

INSERT INTO pedidos (data_pedido, valor_total, id_cliente) VALUES
    ('2023-10-10', 120.00, 1),
    ('2023-10-11', 200.00, 2),
    ('2023-2-12', 150.00, 3),
    ('2023-10-13', 180.00, 4),
    ('2023-10-14', 250.00, 5),
	('2023-11-09', 80.00, 1),
	('2023-11-09', 70.00, 4),
	('2023-11-09', 80.00, 1),
	('2023-11-09', 70.00, 4);
	
INSERT INTO detalhes_do_pedido (quantidade, id_pedido, id_produto) VALUES
    (2, 1, 1),
    (1, 2, 2),
    (3, 3, 3),
    (2, 4, 4),
    (1, 5, 5),
	(1, 6, 1),
	(1, 7, 1),
	(1, 8, 1),
	(1, 9, 1),
	(1, 10, 1),
	(1, 11, 1);


-- LEVEL
-- BUSCANDO DADOS

-- Selecione todos os registros de uma tabela chamada "Clientes".
SELECT * FROM clientes;

-- Selecione apenas os nomes dos clientes da tabela "Clientes".
SELECT nome FROM clientes;

-- Selecione todos os registros da tabela "Pedidos" onde o valor total seja superior a 100.
SELECT * FROM pedidos WHERE valor_total > 100;

-- Selecione todos os produtos da tabela "Produtos" que tenham um preço menor que 50.
SELECT * FROM produtos WHERE preco < 50;

-- Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.
UPDATE clientes SET nome = 'Carlos Ferreira' WHERE nome = 'Carlos Souza';

-- Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.
DELETE FROM detalhes_do_pedido WHERE id_detalhe = 2;
DELETE FROM produtos WHERE id_produto = 2;

-- Selecione todos os pedidos da tabela "Pedidos" que foram feitos por um cliente específico.
SELECT * FROM pedidos WHERE id_cliente = (
		SELECT id_cliente FROM clientes WHERE nome = 'Ana Oliveira'
	);

-- SELECT AVG(preco) AS media_precos FROM produtos;
SELECT AVG(preco) AS media_precos FROM produtos;

-- Crie uma nova tabela chamada "Funcionários" com colunas para nome, cargo e data de contratação, e insira alguns registros nela.
CREATE TABLE funcionarios (
    id_funcionario SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(100),
    data_contratacao DATE
);

INSERT INTO funcionarios (nome, cargo, data_contratacao) VALUES
    ('João Silva', 'Gerente', '2022-01-01'),
    ('Maria Santos', 'Analista', '2022-02-01'),
    ('Pedro Alves', 'Assistente', '2022-03-01'),
    ('Ana Oliveira', 'Analista', '2022-04-01'),
    ('Carlos Souza', 'Assistente', '2022-05-01'),
    ('Mariana Costa', 'Estagiário', '2022-06-01'),
    ('Fernanda Pereira', 'Analista', '2022-07-01'),
    ('Rafaela Rodrigues', 'Estagiário', '2022-08-01');
	
-- LEVEL 3

-- Selecione todos os clientes que fizeram mais de 3 pedidos na tabela "Clientes" e "Pedidos".
SELECT clientes.* FROM clientes WHERE 
	(SELECT COUNT(*) FROM pedidos WHERE 
		pedidos.id_cliente = clientes.id_cliente) > 3;

-- Crie uma consulta que retorne o nome do cliente e o valor total de todos os pedidos feitos por ele.
SELECT clientes.nome, SUM(pedidos.valor_total) as valor_total_pedidos
	FROM clientes, pedidos
	WHERE clientes.id_cliente = pedidos.id_cliente
	GROUP BY clientes.nome;

-- Atualize os preços dos produtos na tabela "Produtos" com base em um aumento percentual específico.
UPDATE produtos SET preco = preco * 1.05;

-- Crie uma consulta que retorne a lista de produtos mais vendidos com base na contagem de pedidos na tabela "Produtos" e "DetalhesDoPedido".
SELECT produtos.nome, COUNT(detalhes_do_pedido.id_pedido) AS total_pedidos
	FROM produtos, detalhes_do_pedido
	WHERE produtos.id_produto = detalhes_do_pedido.id_produto
	GROUP BY produtos.nome
	ORDER BY COUNT(detalhes_do_pedido.id_pedido) DESC;

-- Crie uma consulta que calcule a média, a mediana e o desvio padrão dos preços dos produtos na tabela "Produtos".

SELECT
    AVG(preco) AS media_precos,
    PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY preco) AS mediana_precos,
    STDDEV(preco) AS desvio_padrao_precos
		FROM produtos;

-- Selecione todos os pedidos feitos em um período de tempo específico, usando a tabela "Pedidos" e um intervalo de datas.
SELECT * FROM pedidos WHERE data_pedido BETWEEN '2023-10-14' AND '2023-11-09';

-- Crie uma consulta que identifique os clientes que não fizeram nenhum pedido nos últimos 6 meses na tabela "Clientes" e "Pedidos".

SELECT clientes.* FROM clientes LEFT JOIN pedidos ON clientes.id_cliente = pedidos.id_cliente 
	WHERE pedidos.id_pedido IS NULL OR pedidos.data_pedido < CURRENT_DATE - INTERVAL '6 months';

-- Crie uma consulta que classifique os produtos na tabela "Produtos" com base em seu preço, em ordem decrescente.
SELECT * FROM produtos ORDER BY preco DESC;

-- Crie uma consulta que retorne o total de vendas por categoria de produto na tabela "Produtos" e "DetalhesDoPedido".
SELECT produtos.categoria, SUM(produtos.preco * detalhes_do_pedido.quantidade)
	AS total_vendas
	FROM produtos, detalhes_do_pedido
	WHERE produtos.id_produto = detalhes_do_pedido.id_produto
	GROUP BY produtos.categoria;
	
-- LEVEL 4

-- Faça um UPDATE sem a clausula WHERE numa tabela e vê o que acontece;
UPDATE clientes SET telefone = '123456789';

-- TENTE fazer um rollback;
BEGIN;
UPDATE clientes SET telefone = '987654321';
ROLLBACK;
COMMIT;

-- Delete uma tabela e faça SELECT;
DROP TABLE funcionarios;
SELECT * FROM funcionarios;