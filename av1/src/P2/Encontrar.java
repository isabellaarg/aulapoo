package P2;

import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Digite o tipo: ");
        String tipo = sc.nextLine();
        System.out.println("Digite o status: ");
        String status = sc.nextLine();

        AchadoPerdido ap = new AchadoPerdido(titulo);


        ap.AchadoPerdido(descricao, tipo, status);

        System.out.println("Foto: ");
        String foto = sc.nextLine();
        System.out.println("Digite o local onde foi achado: ");
        String local_achado = sc.nextLine();
        System.out.println("Digite a data e hora: ");
        String data_hora = sc.nextLine();

        ap.completaDados(foto, local_achado, data_hora);

        System.out.println("Escreva o titulo que deseja encontrar: ");
        String achar = sc.nextLine();


        System.out.println(ap.buscarTitulo(achar));
        ap.visualizarDetalhes();


    }
}
