package Lec2;

class Animal{

    String species;
    String typeOf;
    String lifeStamp;

}

class Dog extends Animal{

    String name;
    String color;
    String behaviour;

}

public class ClassA extends Dog{
    public static void main(String[] args) {

        ClassA obj=new ClassA();
        System.out.println(obj.name);
        System.out.println(obj.behaviour);
        System.out.println(obj.color);
        System.out.println(obj.lifeStamp);
        System.out.println(obj.typeOf);
        System.out.println(obj.species);
    }
}
