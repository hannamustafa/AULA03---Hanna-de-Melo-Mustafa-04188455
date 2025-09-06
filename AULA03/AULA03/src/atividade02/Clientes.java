package atividade02;

public class Clientes {
    String nome;
    String cpf;
    int idade;
    public Clientes() {
    }
    public Clientes(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void cadastrarCliente(){
        System.out.println("Gerando carteirinha da biblioteca...");
    }

    public void dadosCliente(){
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade);
    }

}
