package Exercise1;

public abstract class Book implements Library {
    protected String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return 0;
    }

    abstract void setPrice();
}
