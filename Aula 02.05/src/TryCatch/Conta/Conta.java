package TryCatch.Conta;

public class Conta {
    double saldo, limite;

    Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    boolean sacar (double quantidade) throws IllegalArgumentException{
        //throws é um tipo de execeção que permite fazer o tratamento de erros
        if (quantidade > (this.saldo + this.limite)) {
            // se o dinheiro foi maior que o parametro cai nesse erro
            throw new IllegalArgumentException();

        }
        else {
            this.saldo = (this.saldo - quantidade);
            return true;}
    }
}
