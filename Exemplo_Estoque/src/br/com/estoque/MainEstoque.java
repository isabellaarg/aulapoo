package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        //Construtor vazio
        Estoque e1 = new Estoque();

        //pasando os parametros
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinima(5);

        System.out.println(e1.mostra());

        Estoque e2 = new Estoque(1, "Caneta", 10, 5);
        System.out.println(e2.mostra());

        Estoque e3 = new Estoque();
        e3.setNome("Caneta azul");
        e3.setQtdAtual(2);
        e3.setQtdMinima(5);
        e3.precisaRepor();
        System.out.println(e3.mostra());
    }
}
