package Ex03;

public class Female extends Child {
    public Female(String name) {
        super(name, Gender.Female);

        this.name = name;
        setAge(10);
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Female child named " + name + ", age " +age);
    }
}
