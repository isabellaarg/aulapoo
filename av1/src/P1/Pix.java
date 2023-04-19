package P1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data e Hora do pagamento: " + getDataHoraPagamento() + "\nNumero de pagamento: " + getNumeroPagamento() + "\nValor pago: " + getValorPago() + "\nComprovante de Transação Pix" + isComprovanteTransacaoPix();

    }
}
