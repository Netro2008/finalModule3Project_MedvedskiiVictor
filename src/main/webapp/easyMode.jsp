<%--
  Created by IntelliJ IDEA.
  User: lbeal
  Date: 12.07.2025
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to easy game mode!</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Welcome to easy mode! Read the rules and start to play!</h1>
</div>
<p>-you have to answer every question, even if you don't know answer</p>
<p>-you will have 3 lives in easy mode(you can make 3 or least mistakes)</p>
<p>-if you are ready to start the game press button "START"</p>
<br>
<br>
<br>
<br>

<div style="text-align: center;">
    <form action="startingGame" method="get">
        <button type="submit" style="font-size: 56px; border: none; background: none; color: green; cursor: pointer;">
            START
        </button>
    </form>
</div>
</body>
</html>
