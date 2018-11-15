package loops.whileLoop;

import java.util.Random;

public class Processor {

    private static final String GAME_COMMUNICATE = "Round %d \n A = %d \n B = %d \n";
    private static final String END_GAME_COMMUNICATE = "End Game: Round %d \n A = %d \n B = %d \n ";
    private static final String TIE_COMMUNICATE = "WOW! - It's tie! \n Round %d \n A = %d \n B = %d \n";

    private final int sumA;
    private final int sumB;

    Random generator = new Random();

    Processor(int sumA, int sumB) {
        this.sumA = sumA;
        this.sumB = sumB;
    }

    public void process() {

        int sumA = this.sumA;
        int sumB = this.sumB;
        int i = 0;

        while (sumA > sumB) {

            i++;
            sumA += generator.nextInt(9);
            sumB += generator.nextInt(49);

            System.out.println(String.format(GAME_COMMUNICATE, i, sumA, sumB));

            if (sumA == sumB) {
                System.out.println(String.format(TIE_COMMUNICATE, i, sumA, sumB));
            } else if (sumA < sumB) {
                System.out.println(String.format(END_GAME_COMMUNICATE, i, sumA, sumB));
            }
        }
    }

}
