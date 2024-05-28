package Diagram3;


public class Main {
    public static void main(String[] args) {
        Empleado empleadoPrueba = new Empleado("Federico");
        TareaOptativa tareita = new TareaOptativa(324);
        tareita.setNombre("Implementar modulo");
        empleadoPrueba.hacerTarea(tareita);

    }
}