package Diagram2;
public class Cliente {
    private String nombre;

    public Cliente() { }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void pagar (Pedido Pedido) {
        System.out.println("El pedido ha sido pagado, el día de "+ Pedido.getFecha()+" por un " +
                "total de $"+Pedido.getPrecio());
    }

}
