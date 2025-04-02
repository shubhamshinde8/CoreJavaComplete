package Lec2;

abstract class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public abstract void div(int a,int b);


}

class AdvCalculator extends Calculator{
    @Override
    public void div(int a,int b) {
        System.out.println("Iam Abstract method from class Calculator "+(a/b));
    }

//    public int add(int a,int b){
//        return a+b+1;
//    }
}


public class TestMehodOverriding {
    public static void main(String[] args) {
        AdvCalculator obj=new AdvCalculator();
        obj.div(10,20);
        System.out.println(obj.add(2,3));
    }

}
