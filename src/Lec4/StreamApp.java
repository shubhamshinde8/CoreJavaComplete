package Lec4;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

    public void m1(){
        List<Integer> nums=new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        nums.forEach(n-> System.out.println(n%2==0));

    }

    public static void main(String[] args) {
        new StreamApp().m1();
    }
}
