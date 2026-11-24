<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="beatModel" scope="request" class="org.example.Task_2.BeatModel" />

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>DJ View</title>
</head>
<body>
<h1>DJ View</h1>
Beats per minute = <jsp:getProperty name="beatModel" property="BPM" />
<br><hr><br>

<form method="post" action="${pageContext.request.contextPath}/servlet/DJViewServlet">
    BPM: <input type="text" name="bpm"
                value="<jsp:getProperty name='beatModel' property='BPM' />">
    <input type="submit" name="set" value="set"><br />
    <input type="submit" name="decrease" value="<<">
    <input type="submit" name="increase" value=">>"><br />
    <input type="submit" name="on" value="on">
    <input type="submit" name="off" value="off"><br />
</form>
</body>
</html>