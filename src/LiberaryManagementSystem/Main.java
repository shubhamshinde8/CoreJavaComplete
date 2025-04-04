package LiberaryManagementSystem;

public class Main {

    public static void main(String[] args) {
        Member m1=new Member("shubham",101);

        Book b1=new FictionBook("Harry Potter", "J.K. Rowling", "123456789");

        m1.borrowBook(b1);

        b1.showDetails();

        double fine=((Borrowable) b1).calculatefine(5);

//
        System.out.println("Total fine : "+fine);

        m1.showBorrowBook();

        ((Borrowable) b1).returnBook();


    }
}
