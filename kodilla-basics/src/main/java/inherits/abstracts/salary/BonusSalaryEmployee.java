package inherits.abstracts.salary;

public class BonusSalaryEmployee implements Employee {

    private double salary;
    private int products;

    public BonusSalaryEmployee(double salary, int products) {
        this.salary = salary;
        this.products = products;
    }

    public double calculateSalary() {
       return this.products > 0 ? salary * 1.2 : this.salary;
    }

}

