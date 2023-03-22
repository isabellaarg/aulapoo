package br.com.conta;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero, opcao;
        double saldo, limite, rendimento;
        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupança\n<3>Sair"));

            switch (opcao) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
                    limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta"));

                    ContaCorrente cc1 = new ContaCorrente(numero, saldo, limite);

                    JOptionPane.showMessageDialog(null, "Saldo:" + cc1.getSaldo() + "\nSaldo com limite: " + cc1.consultaSaldoTotal(), "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
                    rendimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o rendimento da conta"));

                    ContaPoupanca cp1 = new ContaPoupanca(numero, saldo, rendimento);
                    cp1.calcularRendimento();

                    JOptionPane.showMessageDialog(null, "Saldo: " + cp1.getSaldo(), "\n Conta Poupança ", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Escolha invalida", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        } while(opcao !=3);
    }
}
