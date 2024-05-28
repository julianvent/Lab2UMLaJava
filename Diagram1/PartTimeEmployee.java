package Diagram1;

public class PartTimeEmployee extends Employee {
    private int numberOfWorkHours;
    private int rate;
    
    public PartTimeEmployee(String name, int id, int numberOfWorkHours, int rate) {
        super(name, id);
        this.numberOfWorkHours = numberOfWorkHours;
        this.rate = rate;
    }

    public PartTimeEmployee(PartTimeEmployee partTimer) {
        this(partTimer.getName(), partTimer.getId(), partTimer.getNumberOfWorkHours(), partTimer.getRate());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type of employee: Part Time");
    }

    @Override
    public double calculatePay() {
        double payment = numberOfWorkHours * rate;
        return payment;
    }

    public int getRate() {
        return rate;
    }

    public int getNumberOfWorkHours() {
        return numberOfWorkHours;
    }
}
