public class Person {

    private String firstName, lastName, middleName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    public boolean isFirstName(String firstName) {
        return this.firstName.equals(firstName);
    }

    public boolean isLastName(String lastName) {
        return this.lastName.equals(lastName);
    }

    public boolean isMiddlename(String middleName) {
        return this.middleName.equals(middleName);
    }

    public Person() {
        firstName = lastName = middleName = "";
    }

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(Person other) {
        firstName = other.firstName;
        lastName = other.lastName;
        middleName = other.middleName;
    }

    public void print() {
        System.out.println(firstName + " " + middleName + " " + lastName + " ");
    }
  }
