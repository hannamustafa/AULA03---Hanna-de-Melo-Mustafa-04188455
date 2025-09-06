package atividade05;

public class ProjetoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Focus", 2016);
        Carro carro2 = new Carro("Fiat", "Strada", 2024);

        carro1.informacoes();
        carro1.Ligar();

        System.out.println();

        carro2.informacoes();
        carro2.Ligar();
    }
}
