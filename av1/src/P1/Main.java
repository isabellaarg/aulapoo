package P1;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito("18/04/2023",123456, 250.00, "4445556698733","Visa", "Harry Styles");
        System.out.println(cc.imprimirCupomFiscal());

        CartaoDebito cd = new CartaoDebito("18/04/2023", 8955463, 150.50, "444555666998877", "Louis Tomlinson");
        System.out.println(cd.imprimirCupomFiscal());

        Pix pix = new Pix("18/04/2023", 889956, 899.50, true);
        System.out.println(pix.imprimirCupomFiscal());

    }
}
