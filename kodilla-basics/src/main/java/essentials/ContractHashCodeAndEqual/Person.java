package essentials.ContractHashCodeAndEqual;

public class Person {

    private String name;
    private String surname;
    private int pesel;

    public Person(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person otherPerson = (Person) obj;
            return name.equals(otherPerson.name) &&
                    surname.equals(otherPerson.surname) &&
                    pesel == otherPerson.pesel;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * name.hashCode() + 31 * surname.hashCode() + 7 * pesel;
    }

}
