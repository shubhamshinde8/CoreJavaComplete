package Jdbc;

import Lec3.Student;

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    final static String url="jdbc:mysql://localhost:3306/college";
    final static String userName="root";
    final static String password="23sep";

    final static String addStudent="insert into student values(?,?,?)";

    public static void main(String[] args) throws SQLException {

        Scanner sc=new Scanner(System.in);
        StudentManagement student=new StudentManagement();
        System.out.println("Enter Student Id : ");
        student.setId(sc.nextInt());
        System.out.println("Enter Student Name : ");
        student.setName(sc.next());
        System.out.println("Enter Student Email : ");
        student.setEmail(sc.next());
        Connection con= DriverManager.getConnection(url,userName,password);
        PreparedStatement pstm=con.prepareStatement(addStudent);

        pstm.setInt(1,student.getId());
        pstm.setString(2,student.getName());
        pstm.setString(3,student.getEmail());

//        pstm.executeQuery(addStudent);
       int record=pstm.executeUpdate();
       if (record>0){
           System.out.println("Data inserted....");
       }

        con.close();
//        rs.close();
        sc.close();
    }
}
