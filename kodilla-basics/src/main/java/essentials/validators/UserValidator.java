package essentials.validators;

public class UserValidator {
    public static void main (String[] args) {

        System.out.println("Starting... ");
        System.out.println("Gather data...");

        User user = new User(34.5, 198, "Przemek");

        if (user.validateName()) {
            if (user.validateHeight() && user.validateAge()) {
                System.out.println("User: " + user.getName() + " is older than 30 and higher then 160cm");
            } else {

                System.out.println("User: " + user.getName() + " is younger than 30 or lower than 160cm");
            }
        }
        System.out.println("End of the program.");
    }

}
