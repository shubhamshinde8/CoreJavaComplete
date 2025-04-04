package LiberaryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Member {

    private String name;

    private int memberId;

    private List<Book> books=new ArrayList<>();



    public void borrowBook(Book b){
        books.add(b);
        System.out.println(getName()+" has borrowed :  "+books);

    }

//    public Member(String name, int memberId) {
//        this.name = name;
//        this.memberId = memberId;
//    }


    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

//    public Member(String name, int memberId, List<Book> books) {
//        this.name = name;
//        this.memberId = memberId;
//        this.books = new ArrayList<>();
//    }

    public void showBorrowBook(){

        for (Book b:books){
            b.showDetails();
        }
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }


}
