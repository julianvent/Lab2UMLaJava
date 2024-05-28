package Diagram2;

public class Main {
    public static void main(String[] args) {
        ClienteParticular cliente1 = new ClienteParticular("5204482343");
        cliente1.setNombre("Mauricio");

        cliente1.pagar(new Pedido(91654,"12/04/2023"));
    }
}