package Lec1;

public class Test4 {

//    public Test4 m1(){
////        System.out.println("We are in Test4 app...");
//        return this;
//    }

    public void checkOperator(){

        String s="shubham";
        String s1="shubham";
        String s2=new String("shubham");

        boolean ans=s==s2;
        System.out.println(ans);
        System.out.println(s.equals(s2));

    }

    public static void main(String[] args) throws Throwable {

        System.out.println("Test4 App....");
        new Test4().checkOperator();
//        Test4 obj=new Test4();
//        Test4 obj1=new Test4();
//        System.out.println(obj.m1());
//        System.out.println(obj.m1().hashCode());
//        System.out.println(obj.m1().equals(obj));
//        System.out.println(obj.m1().getClass());
//        System.out.println(obj.m1().toString());
//        System.gc();
    }
}
