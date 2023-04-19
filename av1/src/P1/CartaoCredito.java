package P1;
public class CartaoCredito extends Pagamento{
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;


    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data e Hora do pagamento: " + getDataHoraPagamento() + "\nNumero de pagamento: " + getNumeroPagamento() + "\nValor pago: " + getValorPago()
                + "\nNumero do cartão: " + getNumCartao() + "\nBandeira do cartão: " + getBandeiraCartao() + "Titular do cartão: " + getTitularCartao();

    }
}
