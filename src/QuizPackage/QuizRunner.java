package QuizPackage;

public class QuizRunner {
    public static void main(String[] args) {
         Quiz quiz =new Quiz();
        Question[] questions={
                new Question(quiz.q1, "b"),
                new Question(quiz.q2, "b"),
                new Question(quiz.q3, "a"),
                new Question(quiz.q4, "a")
        } ;
        quiz.grade(questions);
    }
}
