<%--
  Created by IntelliJ IDEA.
  User: lbeal
  Date: 14.07.2025
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest completed</title>
</head>
<body>
    <div style="text-align: center">
        <h1>Congratulation with completing quest!!!</h1>
        <p>Your statistics:</p>
        <p>Nickname: ${username}</p>
        <p>Game mode: ${gameMode}</p>
        <p>Mistakes made: ${mistakesDone}</p>
        <p>Lives left: ${lives}</p>
        <p>Attempts: ${attempt}</p>
    </div>

<div style="display: flex; justify-content: center; gap: 100px; margin-top: 50px;">
    <div style="text-align: center;">
        <form action="startNewGame" method="post">
            <button type="submit" style="font-size: 22px; padding: 10px 20px; border: none; background: #4CAF50; color: white; cursor: pointer; border-radius: 5px;">
                PLAY AGAIN
            </button>
        </form>
    </div>

    <div style="text-align: center;">
        <form action="mainPage" method="post">
            <button type="submit" style="font-size: 22px; padding: 10px 20px; border: none; background: #f44336; color: white; cursor: pointer; border-radius: 5px;">
                MAIN PAGE
            </button>
        </form>
    </div>
</div>

</body>
</html>
