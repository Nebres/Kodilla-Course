package inherits.abstracts.salary;

public class PayoutProcessor {
    public static void main(String[] args) {
        BonusSalaryEmployee employee = new BonusSalaryEmployee(2000, 1);
        PieceWorkSalaryEmployee employee1 = new PieceWorkSalaryEmployee(300, 5);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        processor1.processPayout();
    }

}
