<%@ page import="QuestionsInfo.QuestionBank" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .hidden-text {
            display: none;
            margin-top: 10px;
            padding: 10px;
            background: #f0f0f0;
            border: 1px solid #ddd;
        }

        .show-explanation {
            display: block;
        }
    </style>
    <title>Question 7</title>
</head>
<body>

<div style="text-align: center">
    <h1>Question 7</h1>
    <p>${QuestionBank.getQuestion(6).text}</p>
</div>

<div style="position: absolute; top: 125px; left: 100px;">
    <form action="nextQuestion" method="post">
        <input type="hidden" name="isWrong" value="false">
        <button type="submit" style="font-size: 22px; border: none; background: none; color: blue; cursor: pointer;">
            - I will declare a war to them immediately
        </button>
    </form>
</div>

<div style="position: absolute; top: 165px; left: 100px;">
    <form action="nextQuestion" method="post" id="wrongAnswerForm">
        <input type="hidden" name="isWrong" value="true">
        <button type="button" onclick="showExplanation()" style="font-size: 22px; border: none; background: none; color: blue; cursor: pointer;">
            - I will try to make a peace
        </button>
    </form>
</div>

<!-- Блок с объяснением -->
<div id="explanation" class="hidden-text" style="position: absolute; top: 225px; left: 100px">
    <p>${QuestionBank.getQuestion(6).explanation}</p>
    <button onclick="submitWrongAnswer()" style="font-size: 22px; border: none; background: black; color: white; cursor: pointer;">
        Next question ->
    </button>
</div>

<script>
    function showExplanation() {
        document.getElementById('explanation').classList.add('show-explanation');
    }

    function submitWrongAnswer() {
        document.getElementById('wrongAnswerForm').submit();
    }
</script>


<div class="statistics" style="position: fixed; bottom: 0; left: 0; width: 100%; background: #f1f1f1; padding: 10px; text-align: center;">
    User statistics:
    <p>User's nickname: ${username}</p>
    <p>Game mode: ${gameMode}</p>
    <p>Lives left: ${lives}</p>
    <p>Question: ${index}/${QuestionBank.getTotalQuestions()}</p>
</div>

</body>
</html>
