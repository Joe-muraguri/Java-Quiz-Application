package QuizApp;

public class Main {
    public static void main(String[] args) {
        Question question1 = new Question("What is the capital city of France?",
                new String[]{"London", "Paris", "Berlin", "Oslo"},1);

        Question question2 = new Question("Which is the largest mammal?",
                new String[]{"Elephant", "Rhino", "Lion", "Whale"},3);

        Question question3 = new Question("Which is team won the ucl in 2023?",
                new String[]{"R.Madrid", "city", "Bayern", "PSG"},1);

        Question[] questions = {question1,question2,question3};
        Quiz quiz = new Quiz(questions, questions.length);
        quiz.run();

    }
}
