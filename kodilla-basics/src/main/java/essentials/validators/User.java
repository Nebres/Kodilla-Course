package essentials.validators;

public class User {

    private final double age;
    private final double height;
    private final String name;

    public User(double age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public boolean validateAge() {
        return this.age > 30;
    }

    public boolean validateHeight() {
        return this.height > 160;
    }

    public boolean validateName() {
        return this.name != null;
    }

    public String getName() {
        return this.name;
    }

}
