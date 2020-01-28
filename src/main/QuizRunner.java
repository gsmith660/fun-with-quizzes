package main;

public class QuizRunner {
    public static void main(String[] args) {
        String[] primeQuestionChoices = {"4", "10", "17", "21"};
        Question primeQuestion = new MultipleChoice("Which of the following is a prime number?",
                "c",
                primeQuestionChoices);

        String[] loopingQuestionChoices = {"for",
                                           "do-while",
                                           "if-then",
                                           "try-catch"};
        Question loopingQuestion = new Checkbox("Which of the following control structures provide looping?",
                "ab",
                loopingQuestionChoices);

        Question booleanQuestion = new TrueFalse("Abstract classes can be instantiated in java.",
                "false");

        Quiz testQuiz = new Quiz();
        testQuiz.addQuestion(primeQuestion);
        testQuiz.addQuestion(loopingQuestion);
        testQuiz.addQuestion(booleanQuestion);

        testQuiz.runQuiz();

        System.out.println("\nScore " + testQuiz.gradeQuiz() + " out of " + testQuiz.getQuestionList().size());


    }
}
