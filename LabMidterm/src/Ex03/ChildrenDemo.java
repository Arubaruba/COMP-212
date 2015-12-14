package Ex03;

public class ChildrenDemo {
    public static void main(String args[]) {
        Male male = new Male("Bill");
        Female female = new Female("Mary");

        male.setAge(6);
        male.display();
        female.display();
    }
}
