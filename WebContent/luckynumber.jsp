<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String lucky_message = (String)request.getAttribute("lucky_message");
    String l_message = (String)request.getAttribute("l_message");
    String lu_message = (String)request.getAttribute("lu_message");
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>占いの結果</title>
</head>
<body>

<link href=" css/luckynumber.css" rel=" stylesheet" type="text/css">

<div class="title">
<span class="title001"><h1>😻  今日の運勢 😻</h1></span>
</div>
<br>
<span class="title00">
<p><h2>☆彡 <%=lucky_message%> ☆彡</h2></p>
</span>
<br>
<span class="title01">
<p><%=l_message%></p>
</span>
<br>
<span class="title02">
<p><%=lu_message%></p>
</span>
<br>

<form action="index.html">
<input type="submit" value="戻る" name="submit" id="btn_submit">
</form>
</body>
</html>