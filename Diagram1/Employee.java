package Diagram1;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(Employee employee) {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public double calculatePay() {
        return 0;
    }
}
