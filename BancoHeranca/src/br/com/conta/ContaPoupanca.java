package br.com.conta;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numero, double saldo, double rendimento) {
        super(numero, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    //atualizarRendimentos
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void calcularRendimento(){
        double atual;
        atual = getSaldo() + (getSaldo() * (getRendimento() / 100));
        setSaldo(atual);
    }
}
