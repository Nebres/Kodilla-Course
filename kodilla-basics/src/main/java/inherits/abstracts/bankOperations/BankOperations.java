package inherits.abstracts.bankOperations;

abstract class BankOperations {

    abstract protected void takeOperation();

    abstract protected void checkOperation();

    abstract protected void acceptOperation();

    public void runBankOpertions() {
        this.takeOperation() ;
        this.checkOperation();
        this.acceptOperation();
    }

}
