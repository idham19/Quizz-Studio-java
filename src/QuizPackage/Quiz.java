package QuizPackage;
import java.util.Scanner;

public class Quiz {
    public String q1="What color are bananas \n"+"(a)red/green\n(b)Yellow\n(c)blue";
    public String q2="What color are cherry \n"+"(a)red/green\n(b)red\n(c)yellow";
    public String q3="What color are apples \n"+"(a)red/green\n(b)Yellow\n(c)purple";
    public String q4="What color are blackberry \n"+"(a)black\n(b)Yellow\n(c)blue";

    public void grade(Question[]questions){
        int score =0;
        Scanner input =new Scanner(System.in);
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i].question);
            String answer=input.nextLine();
            if(questions[i].answer.equals(answer)){
                score++;
            }
        }
            System.out.println("your score is " +score+"/" + questions.length );
    }
}
