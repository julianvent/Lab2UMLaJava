package Diagram1;


public class Main {
    public static void main(String[] args) {
        Employee employee = new PartTimeEmployee("Hola", 123, 12, 100);
        Employee employee2 = new FullTimeEmployee("Adios", 124, 1000);

        Company company = new Company("Company", 2);

        company.addEmployee(employee);
        company.addEmployee(employee2);
        company.addEmployee(employee);
        
        company.displayAll();
        
        System.out.println(company.searchName("Hola"));

        company.deleteEmployee("Adios");
        company.deleteEmployee("Hola");
        
        company.deleteEmployee("Hola");
        
        company.searchName("Adios");
    }
}