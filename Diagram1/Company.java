package Diagram1;

public class Company {
    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company(String name, int sizeOfEmployees) {
        this.name = name;
        employees = new Employee[sizeOfEmployees];
        this.numberOfEmployees = 0;
    }

    public void displayAll() {
        if (numberOfEmployees > 0) {
            for (Employee employee : employees)
                employee.display();
        }
    }

    public void addEmployee(Employee employee) {
        if (numberOfEmployees < employees.length) {
            employees[numberOfEmployees] = employee;
            numberOfEmployees++;
        } else
            System.out.println("Cannot add more employees.");
    }

    public int searchName(String name) {
        if (numberOfEmployees > 0) {
            for (Employee employee : employees) {
                if (employee.getName().equals(name))
                    return employee.getId();
            }
        }
        System.out.println("Name not found.");
        return -1;
    }

    public void deleteEmployee(String name) {
        int employeeId = searchName(name);
        
        if (employeeId != -1) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getId() == employeeId) {
                    employees[i] = null;
                    numberOfEmployees--;
                    break;
                }
            }
        } 
    } 

    public double getYearlyPay(String name) {
        int employeeId = searchName(name);

        if (employeeId != -1) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getId() == employeeId) {
                    double yearlyPay = employees[i].calculatePay() * 365;
                    return yearlyPay;
                }
            } 
        }
        return -1;
    }

    public double calculateAveragePayForPartTime() {
        return 0;
    }
}
