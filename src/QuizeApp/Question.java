package QuizeApp;

public class Question {

    private int questionId;
    private String question;
    private String[] options=new String[4];
    private int optNo;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getOptNo() {
        return optNo;
    }

    public void setOptNo(int optNo) {
        this.optNo = optNo;
    }



    public void setOptions(String opt1, String opt2, String opt3, String opt4){
        this.options[0] = opt1;
        this.options[1] = opt2;
        this.options[2] = opt3;
        this.options[3] = opt4;

    }


    public void printQuestion(){
        System.out.println(questionId+" :"+ question );
        for (String val : options){
            System.out.println(val);
        }
    }

    public void checkAnswer(){
        for (int i=0;i< options.length;i++){
            if (i==getOptNo()){
                System.out.println("Correct Answer...");
                break;
            }else System.out.println("Wrong Answer...");
        }
    }

}


