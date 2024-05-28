package Diagram1;

public class FullTimeEmployee extends Employee {
    private int salary;

    public FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type of employee: Full Time");
    }

    @Override
    public double calculatePay() {
        return 0;
    }

}
