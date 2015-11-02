public class PersonDemo {
    public static void main(String args[]) {
        Person donaldTrump1 = new Person("Donald", "John", "Trump");

        donaldTrump1.print();

        Person donaldTrump2 = new Person(donaldTrump1);

        System.out.println("First name of cloned object the same: " + donaldTrump2.isFirstName(donaldTrump1.getFirstName()));
    }
}
