<%--
  Created by IntelliJ IDEA.
  User: lbeal
  Date: 10.07.2025
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Dear user, welcome to my quest game!</h1>
    <p>Please, write your nickname which will be displayed in the game</p>
</div>

<div style="text-align: center;">
    <form action="setUsername" method="post">
        <label for="username">Your nickname:</label>
        <input type="text" id="username" name="username" required>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>