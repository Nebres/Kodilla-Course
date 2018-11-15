package essentials.ContractHashCodeAndEqual;

public class PersonProcessor {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalczyk", 123456);
        Person person2 = new Person("Jan", "Kowalczyk", 123457);
        Person person3 = new Person("Jan", "Kowalczyk", 123456);
        Person person4 = new Person("Jarek", "Kowalczyk", 123456);

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.equals(person4): " + person1.equals(person4));
        System.out.println("person1.equals(null): " + person1.equals(null));
    }

}
