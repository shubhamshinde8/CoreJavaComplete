package Lec1;

public class Test2 {

    public void meth1(int a,int b,int c){
        System.out.println(a+b+c);
        new Test2();
    }

    public void meth2(int a,int b){
        System.out.println(a-b);
    }

    Test2(){
        System.out.println(10/5);
        meth2(10,20);
    }
    Test2(int a,int b){
        System.out.println(a*b);
        meth1(10,20,30);
    }

    public static void main(String[] args) {
        Test2 obj=new Test2(10,20);
    }
}
