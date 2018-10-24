package inherits.interfaces.Atm;

public class AtmImpl implements Atm {

    public void withdraw() {
        System.out.println ("Atm is withdrawing your money. Please wait.");
    }

    public void deposit() {
        System.out.println ("Atm is collecting your money. Please wait.");
    }

}
