package main;

public class TrueFalse extends Question {

    // Constructors
    public TrueFalse(String statement, String answer) {
        super(statement, answer);
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "(True/False)\n";
    }
}
