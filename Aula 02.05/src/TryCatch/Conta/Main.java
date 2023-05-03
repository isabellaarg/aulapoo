package TryCatch.Conta;

public class Main {
    public static void main(String[] args) {
        Conta b1 = new Conta(30, 50);
        try {
            System.out.println(b1.sacar(100));

        }
        catch (IllegalArgumentException e) {
            // capturando a exceção
            System.out.println("Saldo Insuficiente " + e.getMessage());
        }
    }
}
