package Lec1;

public class ato1 {
    public static void main(String[] args) {

        int a = 3;

        int b = 6;

        int result = (~a & b) | (a & ~b);

        System.out.println(result);

    }
}
