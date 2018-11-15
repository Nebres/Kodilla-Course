package euclideanAlgorithm;

public class Nwd {

    private final static String OUTPUT = "Największym wspólnym dzielnikiem liczby %d i liczby %d, jest liczba %d";

    public static void evaluate(int num1, int num2){

        int tempA = num1;
        int tempB = num2;

        while(tempA % tempB != 0){
            int modulo = tempA % tempB;
            tempA = tempB;
            tempB = modulo;
        }

        System.out.println(String.format(OUTPUT, num1, num2, tempB));
    }

}
