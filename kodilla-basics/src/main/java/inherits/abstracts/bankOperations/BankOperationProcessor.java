package inherits.abstracts.bankOperations;

public class BankOperationProcessor {
    public static void main (String[] args) {
        Atm atm = new Atm(true, 1234, 150);
        atm.runAtm();
    }

}
