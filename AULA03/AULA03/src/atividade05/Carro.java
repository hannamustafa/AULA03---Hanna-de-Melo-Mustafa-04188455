package atividade05;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void informacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void Ligar() {
        System.out.println("Vrummm...");
    }

}
