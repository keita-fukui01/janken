<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String message = (String)request.getAttribute("message");
String choosech = (String)request.getAttribute("choosech");
String user = (String)request.getAttribute("user");
String cpuc = (String)request.getAttribute("cpuc");
String cpucpu = (String)request.getAttribute("cpucpu");
String cpuc01 = (String)request.getAttribute("cpuc01");
String gazo = (String)request.getAttribute("gazo");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>じゃんけんゲームの結果</title>

<link href=" css/result01.css" rel=" stylesheet" type="text/css">

<style type="text/css">
<!--
body {
    background-image:url(${gazo});
    background-size: cover;
}
-->
</style>

</head>

<body>

<!--
<div id="title">
<h1>勝敗は？</h1>
</div>
<br>
 -->

<!--
<h2><%=cpuc01%></h2>
<h2><% out.print(cpuc01);%></h2>
<h2>${cpu01}<h2>
 -->
<br>
<br>
<br>
<br>
<br>
<div class="title03">
<span class="title003"><h2>${message}<h2></span>
</div>
<br>
<br>
<br>
<br>
<form action="index.html">
<input type="submit" value="戻る" name="submit" id="btn_submit">
</form>
<br>

<!--
<a href="index.html">戻る</a>
-->

</body>
</html>