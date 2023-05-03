package TryCatch;

public class Exemplo1 {
    public static void main(String[] args) {
        int j=10;
        String[] vetor = new String[1]; //Vetor de string tamanho 1
        vetor[0] = "5";

        try{
            while (j > Integer.parseInt(vetor[0])); // j maior que integer do vetor posição 2
            {
                System.out.println(" " + j);
                j--;

            }
        }
        catch (ArrayIndexOutOfBoundsException e){ //erro sobre o tamanho do vetor
            System.out.println("Não foi fornecido um argumento.");
        }
        catch (java.lang.NumberFormatException e){
            System.out.println("Argumento não é um inteiro valido");
        }
    }
}
