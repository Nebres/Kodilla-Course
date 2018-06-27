import com.kodilla.stream.array.ArrayOperations;

import java.util.stream.IntStream;

public class mainStream implements ArrayOperations {

    private final static int[] ARRAY = new int[] { 2, 55, 31, 22, 16, 14, 88, 23, 56, 72, 62,
            33, 84, 90, 12, 45, 56, 31, 74, 19 };

    public static void main(String[] args) {

        System.out.println(ArrayOperations.getAverage(ARRAY));

    }
}
