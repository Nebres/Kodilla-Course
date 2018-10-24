package inherits.interfaces.knightQuest;

public class DeadIslandQuest implements Quest{

    private static final String NAME = "Dead Island Quest";

    public void process() {

        System.out.println("I choose Dead Island Quest");
    }

    public String getName() {
        return NAME;
    }

}
