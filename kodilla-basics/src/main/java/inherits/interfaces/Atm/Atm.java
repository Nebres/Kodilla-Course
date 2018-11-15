package inherits.interfaces.Atm;

public interface Atm {

    void withdraw();
    void deposit();
    default void connect() {
        System.out.println ("Connecting to your bank...");
    }
    static String endOfProcess() {
        return "End of the the process!";
    }

}
