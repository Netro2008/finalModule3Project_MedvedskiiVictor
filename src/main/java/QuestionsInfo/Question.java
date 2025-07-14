package QuestionsInfo;

import java.util.List;

public class Question {
    private String text;
    private String correctAnswer;
    private List<String> options;
    private String explanation;

    public Question(String text, String explanation) {
        this.text = text;
        this.explanation = explanation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}

