package LiberaryManagementSystem;

public interface Borrowable {

    void borrowBook();

    void returnBook();

    double calculatefine(int latedays);

}
