package helloWorld.divisor;

public class Divisor {
    public static void main(String[] args) {
        int x = 42;
        int dzielnik = 7;
        int modulo = x % dzielnik;
        String dzielnikSiedem = "Liczba 7 jest dzielnikiem liczby ";
        String niepodzielneSiedem = "Liczba 7 NIE jest dzielnikiem liczby ";

        if (dzielnik == 7) {
            if (modulo == 0) {
                System.out.println(dzielnikSiedem + x + ".");
            } else {
                System.out.println(niepodzielneSiedem + x + ".");
            }
        } else {
            System.out.println("Zmien dzielnik na 7!");
        }
    }

}

