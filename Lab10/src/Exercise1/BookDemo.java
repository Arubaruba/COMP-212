package Exercise1;

public class BookDemo {
    static void printBookInfo(Book book) {
        System.out.println("Book title: " + book.getTitle() + ", price: " + book.getPrice());
    }

    public static void main(String args[]) {
        printBookInfo(new Fiction("Fiction 1", 40));
        printBookInfo(new Nonfiction());

        Book books[] = {
                new Fiction("Fiction 1", 36),
                new Fiction("Fiction 2", 30),
                new Fiction("Fiction 3", 30),
                new Fiction("Fiction 4", 33),
                new Fiction("Fiction 5", 30),

                new Nonfiction(),
                new Nonfiction(),
                new Nonfiction(),
                new Nonfiction(),
                new Nonfiction()
        };

        for (Book book: books) {
            if (book instanceof Fiction) {
                Fiction fiction = (Fiction) book;
                fiction.setTitle("Modified title");

            } else if (book instanceof Nonfiction) {
                Nonfiction nonfiction = (Nonfiction) book;
                // Can only set the price to the predefined
                nonfiction.setPrice();
            }

            printBookInfo(book);
        }
    }
}
