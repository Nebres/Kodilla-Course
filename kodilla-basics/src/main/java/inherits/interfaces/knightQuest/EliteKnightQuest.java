package inherits.interfaces.knightQuest;

public class EliteKnightQuest implements Quest {

    private static final String NAME = "Elite Knight Quest";

    public void process() {
        System.out.println("I choose Elite Knight Quest");
    }

    public String getName() {
        return NAME;
    }

}
