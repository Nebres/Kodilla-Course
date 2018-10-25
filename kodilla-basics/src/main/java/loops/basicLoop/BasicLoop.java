package loops.basicLoop;

public class BasicLoop {

    private static final String OUTPUT_COMMUNICATE = "The mean of given values equals: ";
    private static final String ARRAY_ELEMENT = "Element %d = %d";
    private static final String EMPTY_LINE = "";

    public static void main(String[] args) {

        int[] array = new int[] { 2, 55, 31, 22, 16, 14, 88, 23, 56, 72, 62, 33, 84, 90, 12, 45, 56, 31, 74, 19 };
        double sum = 0.00;

        for(int i = 0; i < array.length; i++) {
            System.out.println(String.format(ARRAY_ELEMENT, i, array[i]));
            sum += array[i];
        }

        System.out.println(EMPTY_LINE);
        System.out.println(OUTPUT_COMMUNICATE + sum/array.length);
    }

}
