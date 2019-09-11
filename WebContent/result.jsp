<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>じゃんけんゲーム結果</title>



</head>
<body>

<link href=" css/result.css" rel=" stylesheet" type="text/css">

<%
String message = (String)request.getAttribute("message");
String choosech = (String)request.getAttribute("choosech");
String user = (String)request.getAttribute("user");
String cpuc = (String)request.getAttribute("cpuc");
String cpucpu = (String)request.getAttribute("cpucpu");
String gazo = (String)request.getAttribute("gazo");
%>
<br>
<br>
<br>
<br>
<span class="title"><h1>CPUが選んだ手は？</h1></span>
<br>
<br>
<br>
<br>
<section>
<div class="c2">
<a href="#"><img src="/janken/<%=cpucpu%>" alt="" /></a>
</div>
</section>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<!--
<div id="title02">
<p><%=cpuc%></p>
<p><img src="/janken/<%=cpucpu%>"></p>
</div>
<br>
 -->


<!--
<div id="title01">
<p><%=choosech%></p>
<p><img src="/janken/<%=user%>"></p>
</div>
<br>
 -->



<%
String cpuc01 = null;
cpuc01 = "cpuc";

session.setAttribute("cpuc01", cpuc01);     // JSP→JSPに送信する場合 例:session.setAttribute("cpuc01", cpuc01);
session.setAttribute("message", message);   // JSP→JSPに送信する場合
session.setAttribute("gazo", gazo);
%>

<!--
<div id="title03">
<h2><%=message%></h2>
</div>
<br>
<br>
<br>
<br>
 -->
<br>
<br>
<br>
<br>
<form action="result01.jsp" method="get">
<input type="submit" value="勝敗は?" name="cpuc01" id="btn_submit">
</form>
<br>

<!--
<a href="index.html">戻る</a>
 -->

</body>
</html>