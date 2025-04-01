package Lec1;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // String Performance
        startTime = System.nanoTime();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str += "Programming";  // Creates a new object each time!
        }
        endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) + " ns");

        // StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Programming");  // Modifies the same object
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sbuilder.append("Programming");  // Modifies the same object
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
