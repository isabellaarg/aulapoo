package P1;

public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;


    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal() {
        return "Data e Hora do pagamento: " + getDataHoraPagamento() + "\nNumero de pagamento: " + getNumeroPagamento() + "\nValor pago: " + getValorPago()
                + "\nNumero do cartão: " + getNumCartao() + "Titular do cartão: " + getTitularCartao();

    }
}
