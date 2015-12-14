package Exercise1;

public class Nonfiction extends Book {
    public Nonfiction() {
        super("Nonfiction1");
    }

    @Override
    void setPrice() {
        price = 29.99;
    }

    @Override
    public String getName() {
        return "Nonfiction book 1";
    }

    @Override
    public int getBookCapacity() {
        return 3000;
    }

    @Override
    public int getSquareMeters() {
        return 100;
    }
}
