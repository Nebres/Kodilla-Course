package essentials.wrappers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Wrappers {

    private static final String TRUE_INT_OUTPUT = "Compare %d and %d - they are equal.";
    private static final String FALSE_INT_OUTPUT = "Compare %d and %d- they are not equal.";
    private static final String TRUE_BOOLEAN_OUTPUT = "Compare %b and %b - they are equal.";
    private static final String FALSE_BOOLEAN_OUTPUT = "Compare %b and %b- they are not equal.";
    private static final String TRUE_DOUBLE_OUTPUT = "Compare %s and %s - they are equal.";
    private static final String FALSE_DOUBLE_OUTPUT = "Compare %s and %s- they are not equal.";

    public static void main(String[] args) {

        Random generator = new Random();

        int[] primitiveInts = new int[] {
                generator.nextInt(6)+1, generator.nextInt(11) + 11, generator.nextInt(11) + 21
        };

        List<Integer> wrapperIntegers = new LinkedList<Integer>();

        for (int i = 0; i < primitiveInts.length; i++) {
            wrapperIntegers.add(primitiveInts[i]);
            if (primitiveInts[i] == wrapperIntegers.get(i)) {
                System.out.println(String.format(TRUE_INT_OUTPUT, primitiveInts[i],wrapperIntegers.get(i)));
            } else {
                System.out.println(String.format(FALSE_INT_OUTPUT, primitiveInts[i],wrapperIntegers.get(i)));
            }
        }

        double[] primitiveDoubles = new double[] {
                generator.nextDouble(), generator.nextDouble() * 10, generator.nextDouble() * 100
        };

        List<Double> wrapperDoubles = new LinkedList<Double>();

        for (int i = 0; i < primitiveDoubles.length; i++) {
            wrapperDoubles.add(primitiveDoubles[i]);
            if (primitiveDoubles[i] == wrapperDoubles.get(i)) {
                System.out.println(String.format(TRUE_DOUBLE_OUTPUT, primitiveDoubles[i],wrapperDoubles.get(i)));
            } else {
                System.out.println(String.format(FALSE_DOUBLE_OUTPUT, primitiveDoubles[i],wrapperDoubles.get(i)));
            }
        }

        boolean[] primitiveBooleanArray = new boolean[] {
                generator.nextBoolean(), generator.nextBoolean(), generator.nextBoolean()
        };

        List<Boolean> wrapperBooleanList = new LinkedList<Boolean>();

        for (int i = 0; i < primitiveBooleanArray.length; i++) {
            wrapperBooleanList.add(primitiveBooleanArray[i]);
            if (primitiveBooleanArray[i] == wrapperBooleanList.get(i)) {
                System.out.println(String.format(TRUE_BOOLEAN_OUTPUT, primitiveBooleanArray[i],
                        wrapperBooleanList.get(i)));
            } else {
                System.out.println(String.format(FALSE_BOOLEAN_OUTPUT, primitiveBooleanArray[i],
                        wrapperBooleanList.get(i)));
            }
        }
    }

}

