package Exercise1;

public class Fiction extends Book {
    public Fiction(String title, double price) {
        super(title);
        this.price = price;
    }

    String getLibraryName() {
        return name;
    }

    int getLibraryCapacity() {
        return bookCapacity;
    }

    void setTitle(String title) {
        this.title = title;
    }

    @Override
    void setPrice() {
        price = 31.99;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getBookCapacity() {
        return 0;
    }

    @Override
    public int getSquareMeters() {
        return 0;
    }
}
