package main;

public abstract class QuestionWithChoices extends Question {
    private String[] choices;
    private char[] choiceCodes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};

    // Constructors
    public QuestionWithChoices(String question, String answer, String[] choices) {
        super(question, answer);
        this.choices = choices;
    }

    // toString()
    @Override
    public String toString() {
        String presentChoices = "";
        for (int i = 0; i < this.choices.length; i++) {
            presentChoices += choiceCodes[i] + ": " + choices[i] + "\n";
        }
        return super.toString() + presentChoices;
    }

    // Setters
    public void setChoices(String[] choices) {
        this.choices = choices;
    }
}
