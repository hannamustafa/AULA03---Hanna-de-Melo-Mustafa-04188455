package atividade02;

public class ProjetoCarteirinha {
    public static void main(String[] args) {
        Clientes obj1 = new Clientes("Carla", "123.456.789-00", 15);
        Clientes obj2 = new Clientes("Andre", "664.887.932-51", 25);

        obj1.cadastrarCliente();
        obj1.dadosCliente();

        obj2.cadastrarCliente();
        obj2.dadosCliente();
    }
    
}
