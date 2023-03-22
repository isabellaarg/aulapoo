package br.com.conta;

public class ContaCorrente extends Conta {
    private double limite;

    //construtor
    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    //consultaLimite
    public double getLimite() {
        return limite;
    }
    //alterarLimite
    public void setLimite(double limite) {
        this.limite = limite;
    }
    //ConsultaSaldoTotal
    //Seria saldo + limite, por isso foi utilizado o get para puxar o saldo da classe conta
    public double consultaSaldoTotal(){
        return getSaldo() + getLimite();
    }



}
