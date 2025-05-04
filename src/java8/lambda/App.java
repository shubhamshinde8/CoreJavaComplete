package java8.lambda;

public class App {
    public static void main(String[] args) {
        Car car=(name)->"Car has Been Start : "+name;
        System.out.println(car.start("Brezza"));

        calcualator c=(a,b)->a+b;
        System.out.println(c.addition(10,20));
    }
}
