public class Employee {
    private String name;
    private double salary;

    public Employee(String employeeName, double annualSalary) {
        name = employeeName;
        salary = annualSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualIncome() {
        return salary;
    }
}