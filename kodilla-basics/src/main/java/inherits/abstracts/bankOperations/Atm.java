package inherits.abstracts.bankOperations;

public class Atm extends BankOperations {
    private final boolean card;
    private final int pin;
    private final double amount;

    public Atm (boolean card, int pin, double amount) {
        this.card = card;
        this.pin = pin;
        this.amount = amount;
    }

    private boolean validateCard() {
        return this.card;
    }

    private boolean validatePin() {
        return this.pin == 1234;
    }

    private double getAmount() {
        return this.amount;
    }

    private void withdrawOperation() {
        System.out.println("Atm collecting " + getAmount() + " $ for You");
    }

    private void endingOperation() {
        System.out.println("Thank You for using our ATM");
    }

    private void insertCard() {
        System.out.println("Insert Your bank card.");
    }

    private void insertPin() {
        System.out.println("Insert Your PIN.");
    }

    private void insertAmount() {
        System.out.println("Insert amount.");
    }

    protected void takeOperation() {
        System.out.println("Thank You. Withdraw operation start.");
    }

    protected void checkOperation() {
        System.out.println("Checking Your account Balance");
    }

    protected void acceptOperation() {
        System.out.println("Operation accepted");
    }

    public void runAtm() {

        insertCard();

        if (validateCard()) {
            insertPin();
            if (validatePin()) {
                insertAmount();
                if (getAmount() > 0) {
                    runBankOpertions();
                    withdrawOperation();
                    endingOperation();
                } else {
                    System.out.println("Inccorect Amount");
                }
            } else {
                System.out.println("Inccorect PIN");
            }
        } else {
            System.out.println("No bank card");
        }
    }

}
