package helloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        String i = "Programowanie";
        String j = "czas zaczac";

        for(int k = 0; k < 10 ; k++) {
            for (int l = 0; l < 8; l++) {
                System.out.print(i + " " + j + ", ");
            }
            System.out.println(i + " " + j + ". ");
        }
    }

}

