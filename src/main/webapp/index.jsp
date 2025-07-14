<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Welcome to my quest game ${username}!</h1>
    <p>Please select difficulty</p>
</div>

<div style="position: absolute; top: 125px; left: 200px;">
    <form action="easyMode" method="POST">
        <button type="submit" style="font-size: 22px; border: none; background: none; color: green; cursor: pointer;">
            Easy mode (3 lives)
        </button>
    </form>
</div>

<div style="position: absolute; top: 125px; right: 200px;">
    <form action="hardcoreMode" method="POST">
        <button type="submit" style="font-size: 22px; border: none; background: none; color: red; cursor: pointer;">
            Hardcore mode (1 life)
        </button>
    </form>
</div>

<br/>
</body>
</html>