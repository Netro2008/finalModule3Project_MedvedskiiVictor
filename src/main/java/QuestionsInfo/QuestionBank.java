package QuestionsInfo;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    private static final List<Question> questions = Arrays.asList(
            new Question("You are a president of a country, and you need to solve a problem in your country!\n" +
            "  You have not enough medicine in your country, what you will do?",
            "You hired new doctors, but they had nowhere to work, and they left.\n" +
            "    The problem remained unresolved."),
            new Question(
                    "Medicine went up, but people started to complete about how expensive it is." +
                            " What will you do to fix that issue?",
            "The doctors were not satisfied with the reduced salary and they" +
                    " staged a revolt, there is no one left in the country to treat people"),
            new Question
            ("People were satisfied with everything, before a catastrophe. People started to die, because of your " +
                    "tablets. What will you do?","You lied pretty good, but someone knew before that" +
                    " it was your fault and told others..."),
            new Question
            ("Food companies wrote you an email about the need to raise taxes since " +
                    "they are not satisfied with the cost of the products they supply",
                    "Your economy has collapsed very severely, as they requested a huge amount of money"),
            new Question("People in your country are satisfied with everything congrats! But sadly you " +
                    "can't do everything you want to... Other authorities in the country " +
                    "think that country isn't earning enough money and asked you to increase water " +
                    "taxes", "People staged a rebellion and killed you"),
            new Question
                    ("Authorities were so angry at you that you didn't increase taxes immediately! They" +
                            " asked you to leave your president post", "You tried to kill them, but they " +
                            "predicted it and were first"),
            new Question("People really loved you and helped you to" +
                    " get your post back. European countries declared you an economical war, what you will do?",
                    "You tried to make an offer with them, but they didn't agree with it and people thought that " +
                            "you are coward, you lost your post again"),
            new Question
                    ("People were so proud of that brave president. What will you do next?",
                            "You were too kind and your country collapsed economically"),
            new Question(
                                    "People were so proud of how good you are that didn't even expect new taxes. " +
                                            "What you will do next?", "People notified that food has very bad composition " +
                    "they really liked your plan, but many people died because of the food"),
            new Question("Your country now is very strong economically and people are happy! Time to think about protection... " +
                    "How many percent from the country's budget you will allocate for the development " +
                    "of the armed forces", "5 percent were not enough, because your country is very strong economically! " +
                    "You got attacked and lost all your resources..."));

    public static Question getQuestion(int index) {
        return questions.get(index);
    }

    public static int getTotalQuestions() {
        return questions.size();
    }
}
