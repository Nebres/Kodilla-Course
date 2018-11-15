package inherits.interfaces.Atm;

public class atmProccesor {
    public static void main (String[] args) {

        Atm atm = new AtmImpl();

        atm.connect();

        atm.withdraw();

        atm.deposit();

        System.out.println(Atm.endOfProcess());
    }

}
