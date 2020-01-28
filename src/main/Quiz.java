package main;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questionList = new ArrayList<>();

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public void runQuiz() {
        for (Question question : questionList) {
            question.ask();
        }
    }

    public int gradeQuiz() {
        int points = 0;
        for (Question question : questionList) {
            points += question.isCorrect() ? 1 : 0;
        }
        return points;
    }

    // Getters
    public List<Question> getQuestionList() {
        return questionList;
    }
}
