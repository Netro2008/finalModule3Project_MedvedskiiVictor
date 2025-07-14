import QuestionsInfo.Question;
import QuestionsInfo.QuestionBank;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionsTests {

    @Test
    public void isMethodGivingCorrectInformationTest() {
        Question question = new Question("Кто ты?", "Вы точно человек!");

        assertEquals("Кто ты?", question.getText());
    }

    @Test
    public void isQuestionsBankWorkingCorrectly() {
        Question question = QuestionBank.getQuestion(0);

        assertEquals("You are a president" +
                " of a country, and you need to solve a problem in your country!\n" +
                "  You have not enough medicine in your country, what you will do?", question.getText());

    }
}
