package Lec2;

class A{

    public A(){
        System.out.println("default constructor A ");
    }

    public A(int a){
        System.out.println("Parameterized constructor "+a);
    }

}

class B extends A{

    public B(){
        System.out.println("Default constructor B");
    }

    public B(int a){
        System.out.println("Parameterized constructor in B "+a);
    }
}

public class ClassC extends B{

    ClassC(){
//        super(12);
        this(23);
        System.out.println("Default constructor in c ");
    }

    ClassC(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ClassC obj=new ClassC();
    }
}
