package QuizeApp;

import java.util.Scanner;

public class QuestionService {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Question obj=new Question();
        obj.setQuestionId(1);
        obj.setQuestion("Who is the prime minister of india ? ");
        obj.setOptions("Amit shaha","Narendra Modi","Yogi adityanath","Raj Thakere");




        obj.printQuestion();
        System.out.println("Choose Answer ");
        obj.setOptNo(sc.nextInt());
        obj.checkAnswer();
    }
}
