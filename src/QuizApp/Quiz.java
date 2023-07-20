package QuizApp;

import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions, int score) {
        this.questions = questions;
        this.score = 0;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions){
            System.out.println(question.getText());

            String[] options = question.getOptions();
            for (int i = 0; i< options.length; i++){
                System.out.println((i+1) + "." + options[i]);
            }
            System.out.println("Enter the number of Your Answer");
            int userAnswer = scanner.nextInt();

            if (question.isCorrectAnswer(userAnswer-1)){
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.println("Incorrect\n");
            }
        }
        System.out.println("Quiz completed\n");
        System.out.println("Your score is: " + score + " Out of " + questions.length);

    }
}
