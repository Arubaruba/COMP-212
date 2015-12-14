package Exercise1;

public interface Library {
    String name = "Library1";
    int bookCapacity = 3000;

    abstract String getName();

    abstract int getBookCapacity();

    abstract int getSquareMeters();
}
