public class GerenciadorDeImpostoDeRenda {

    public GerenciadorDeImpostoDeRenda() {}
    private double somaTotalTributario = 0;

    public void adicionar(Tributavel tributavel){
        this.somaTotalTributario += tributavel.calculaTributos();
    }

    public double somaTotal(){
        return this.somaTotalTributario;
    }
}
