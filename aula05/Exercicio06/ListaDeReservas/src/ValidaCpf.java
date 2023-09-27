public class ValidaCpf {

    public ValidaCpf(){}

    public boolean validarCPF(String cpf) {
        if(cpf.length() != 11 || cpf.equals("00000000000")){
            return false;
        }

        int[] cpfArray = new int[11];

        int primeiroDigito = 0;
        int segundoDigito = 0;

        for(int i = 0; i < 11; i++){
            cpfArray[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        for(int i = 10; i > 1; i--){
            primeiroDigito += i * cpfArray[10 - i];
        }

        primeiroDigito *= 10;

        if(primeiroDigito % 11 == cpfArray[9]) {

            for (int i = 11; i > 1; i--) {
                segundoDigito += i * cpfArray[11 - i];
            }

            segundoDigito *= 10;

            if (segundoDigito % 11 != cpfArray[10]) {
                return false;
            }

        } else {

            return false;

        }

        return true;
    }
}
