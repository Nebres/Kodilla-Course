package collection.maps.task1;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String peselId;

    public Student (String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {return true;}
        if (obj == null) {return false;}
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            return firstName.equals(otherStudent.firstName) &&
                    lastName.equals(otherStudent.lastName) &&
                    peselId.equals(otherStudent.peselId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17*firstName.hashCode() + 31*lastName.hashCode() + 37*peselId.hashCode();
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " (" + this.peselId + ")";
    }

}

