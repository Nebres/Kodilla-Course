package inherits.interfaces.knightQuest;

public class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void runProcess() {
        this.quest.process();
        System.out.println (this.quest.getName() + " is Finished");
    }

}
