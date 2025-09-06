package atividade01;

public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    public Livro(String titulo, int numeroPaginas, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public Livro() {
    }

    void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }

    double calcFrete(String cep){
        System.out.println("Calculando frete para o cep: " + cep);
        return valorFrete;
    }

    void vender(){
        System.out.printf("Vendendo livro por R$ %.2f", preco);
    }

    String trocar(){
        return "Livro trocado!";
    }
}
