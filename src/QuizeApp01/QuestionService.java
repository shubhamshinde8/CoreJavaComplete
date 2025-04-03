package QuizeApp01;

import java.util.Scanner;

public class QuestionService {

    Question question[]=new Question[5];

    String selection[]=new String[5];


    public QuestionService(){

        question[0]=new Question("1","size of int ","1","9","4","3","4");
        question[1]=new Question("2","size of double ","8","2","1","9","8");
        question[2]=new Question("3","size of float ","4.4","4","7","12","4.4");
        question[3]=new Question("4","size of char ","1","2","3","4","2");
        question[4]=new Question("5","size of short ","3","1","2","8","2");
    }

    int score=0;

    public void displayQuestion(){
        int i=0;

       for (Question q:question){
           System.out.println("Question No : "+q.getId());
           System.out.println(q.getQuestion());
           System.out.println(q.getOption1());
           System.out.println(q.getOption2());
           System.out.println(q.getOption3());
           System.out.println(q.getOption4());
           Scanner sc=new Scanner(System.in);
           selection[i]=sc.nextLine();


           if (selection[i].equals(q.getAnswer())){
               score++;
           }
           i++;
       }

        System.out.println();
        System.out.println("Your score : "+score);

    }
}
