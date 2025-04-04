package LiberaryManagementSystem;

public class FictionBook extends Book implements Borrowable{

    public FictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    void showDetails() {
        System.out.println("Book Title "+ getTitle());
        System.out.println("Book Author "+ getAuthor());
        System.out.println("Book isbn "+ getIsbn());
    }

    @Override
    public void borrowBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public double calculatefine(int latedays) {
        return latedays*5;
    }
}
