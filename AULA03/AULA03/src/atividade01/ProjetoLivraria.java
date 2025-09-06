package atividade01;

public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro obj1 = new Livro("Three", 635, 2022, 64.50);
        Livro obj2 = new Livro("Beach Read", 540, 2020, 75.00);

        System.out.println("Informações do primeiro livro: " + obj1.titulo + ", " + obj1.numeroPaginas + ", " + obj1.anoPublicacao + ", " + obj1.preco);
        System.out.println("Informações do segundo livro: " + obj2.titulo + ", " + obj2.numeroPaginas + ", " + obj2.anoPublicacao + ", " + obj2.preco);

    obj1.cadastrar();
    double frete = obj1.calcFrete("66097-055");
    System.out.printf("Frete  R$ %.2f%n", frete);
    obj1.vender();
    String troca = obj1.trocar();
    System.out.println(troca);

    obj2.cadastrar();
    double frete2 = obj2.calcFrete("66097-055");
    System.out.printf("Frete  R$ %.2f%n", frete2);
    obj2.vender();
    String troca2 = obj2.trocar();
    System.out.println(troca2);
    }
}
