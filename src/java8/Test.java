package java8;

import java.util.ArrayList;
import java.util.List;

public class Test {

    void understandingJava8(){

        List<Integer> list1=List.of(1,2,3,4,5);



       List<Integer> listEven=new ArrayList<>();


//        for (Integer i:list1){
//            if (i%2==0){
//                listEven.add(i);
//            }
//        }

        System.out.println(list1);
        System.out.println(listEven);
    }

    public static void main(String[] args) {
        new Test().understandingJava8();
    }
}
