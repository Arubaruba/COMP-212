package Ex03;


abstract public class Child {

    public enum Gender {Male, Female};

    Gender gender;
    String name;
    int age;

    public Child(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    abstract public void setAge(int age);
    abstract public void display();
}
