package Lec1;

public class Test4 {

    public Test4 m1(){
//        System.out.println("We are in Test4 app...");
        return this;
    }

    public static void main(String[] args) throws Throwable {

        System.out.println("Test4 App....");
        Test4 obj=new Test4();
        Test4 obj1=new Test4();
        System.out.println(obj.m1());
        System.out.println(obj.m1().hashCode());
        System.out.println(obj.m1().equals(obj));
        System.out.println(obj.m1().getClass());
        System.out.println(obj.m1().toString());
//        System.gc();
    }
}
