package main;

import java.util.Scanner;

public abstract class Question {
    private String question;
    private String userInput;
    private String answer;
    private boolean correct = false;

    public void ask() {
        System.out.print(this.toString());

        Scanner input = new Scanner(System.in);
        this.userInput = input.nextLine();

        if (this.userInput.toLowerCase().equals(this.answer.toLowerCase())) {
            correct = true;
        }
    }

    // Constructors
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // toString
    @Override
    public String toString() {
        return "\nQuestion: " + this.question + "\n";
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public String getUserInput() {
        return userInput;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }
}