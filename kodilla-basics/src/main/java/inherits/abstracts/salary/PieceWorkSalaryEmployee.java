package inherits.abstracts.salary;

public class PieceWorkSalaryEmployee implements Employee {

    private int products;
    private double productsPay;

    public PieceWorkSalaryEmployee(int products, double productsPay) {
        this.products = products;
        this.productsPay = productsPay;
    }

    public double calculateSalary() {
        return this.products * this.productsPay;
    }

}
