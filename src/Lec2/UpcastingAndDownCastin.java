package Lec2;

class Computer{

    public void performance(){
        System.out.println("It is good for low level tasking");
    }


}

class Laptop extends Computer{

    public void performance1(){
        System.out.println("It is good for carry");
    }
}

public class UpcastingAndDownCastin {

    public static void main(String[] args) {
        Computer lap=new Laptop();
        lap.performance();

        Laptop lap1=(Laptop) lap;
        lap1.performance1();
    }
}
