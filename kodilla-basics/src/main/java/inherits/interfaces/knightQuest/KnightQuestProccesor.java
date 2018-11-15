package inherits.interfaces.knightQuest;

public class KnightQuestProccesor {
    public static void main (String[] args) {
        Knight knight = new Knight(new DeadIslandQuest());
        knight.runProcess();
    }

}
