import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaString {

    public static void main(String[] args) {
        //Leitura via classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome ");
        String nome = entrada.nextLine();
        System.out.println("Nome digitado " + nome);

        //Leirua via classe BufferredReader
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String userName = null;
        System.out.println("Digite seu UserName");
        try {
            userName = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO erro tentando ler o nome");
            System.exit(1);
        }
        System.out.println("Seu Username é " + userName);
    }
}
