package Diagram1;

public class FullTimeEmployee extends Employee {
    private int salary; 

    private static int LABOUR_DAYS = 15;
    public FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public FullTimeEmployee(FullTimeEmployee fullTimer) {
        this(fullTimer.getName(), fullTimer.getId(), fullTimer.getSalary());
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
        double payment = salary * LABOUR_DAYS;
        return payment;
    }

}
