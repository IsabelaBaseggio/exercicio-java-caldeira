public class BuscaDiaDaSemana {


    public BuscaDiaDaSemana(){}

    public void buscarMensagemDoDia(int valor){
        switch (valor) {
            case (1):
                System.out.println(DiaDaSemana.SEGUNDA + ": Dia de estudar.");
                break;
            case (2):
                System.out.println(DiaDaSemana.TERCA + ": Dia de revisar.");
                break;
            case(3):
                System.out.println(DiaDaSemana.QUARTA + ": Dia de exercitar.");
                break;
            case(4):
                System.out.println(DiaDaSemana.QUINTA + ": Dia de aula.");
                break;
            case(5):
                System.out.println(DiaDaSemana.SEXTA + ": Dia de faculdade.");
                break;
            case(6):
                System.out.println(DiaDaSemana.SABADO + ": Dia de lazer.");
                break;
            case(7):
                System.out.println(DiaDaSemana.DOMINGO + "Dia de descanso.");
            default:
                System.out.println("Essa opção não é válida.");
        }
    }
}
