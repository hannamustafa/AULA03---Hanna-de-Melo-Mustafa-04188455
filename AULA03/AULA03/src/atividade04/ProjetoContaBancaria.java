package atividade04;

public class ProjetoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("88821-0", "Sabrina Maués", 50000.0);
        ContaBancaria conta2 = new ContaBancaria("42873-9", "Ramiro", 2.0);

        conta1.consultarSaldo();
        conta1.depositar(40.0);
        conta1.sacar(150.0);
        conta1.consultarSaldo();

        System.out.println();

        conta2.consultarSaldo();
        conta2.depositar(300.0);
        conta2.sacar(500.0);
        conta2.consultarSaldo();
    }   
    
}
