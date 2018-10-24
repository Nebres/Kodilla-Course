package inherits;

public class User {

    private String name;
    private String surname;
    private String sex;
    private String age;
    private String mail;

    public User(String name, String surname, String sex, String age, String mail) {

        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSex() {
        return this.sex;
    }

    public String getAge() {
        return this.age;
    }

    public String getMail() {
        return this.mail;
    }

    public void logIn() {
    }

    public void logOut() {
    }

    public void deleteUser() {
    }

    public void registery() {
    }

}
