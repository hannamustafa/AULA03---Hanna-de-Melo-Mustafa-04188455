package atividade04;

public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;
    public ContaBancaria() {
    }
    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido.");
        }
        return saldo;
    }

    public double sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

}
