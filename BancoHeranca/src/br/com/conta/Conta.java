package br.com.conta;

public class Conta {
    private int numero;
    private double saldo;

    //Construtor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Consultar saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodo sacar
    public void sacar(double valor){
        if(valor<=saldo)
            saldo-=valor;
    }

    //Metodo deposita
    public void depositar(double valor){
        saldo+=valor;
    }
}
