package Ex03;

import java.io.IOException;

public class Male extends Child {
    public Male(String name) {
        super(name, Gender.Male);

        this.name = name;
        setAge(5);
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Male child named " + name + ", age " +age);
    }
}
