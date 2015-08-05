<%@page contentType="text/html;charset=UTF-8" %>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.object.*" %>
<%@page import="servlet.*" %>

<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Script-Type" content="text/javascript">
    <script type="text/javascript" src="./resources/js/jquery-2.1.4.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="./resources/js/ObjectSample.js" charset="UTF-8"></script>
    <script type="text/javascript" src="./resources/js/InputBox.js" charset="UTF-8"></script>
	<link rel="stylesheet" type="text/css" href="./resources/css/ObjectSample.css">
    <link rel="stylesheet" type="text/css" href="./resources/css/InputBox.css">
	<title>ObjectSample</title>
</head>


<body>
<div id="contents">
    <div id="leftSide">
	<h1>ProfileObject</h1>
	<br/>
	<%@ include file="contents/InputBox.jsp" %>

	<button id="addButton" onclick="openBox()">追加</button>
	<br/>
	<%
		ArrayList<ProfileObject> poList = (ArrayList<ProfileObject>)request.getAttribute("requetPoList") ;
		if(poList != null){
			for(ProfileObject po : poList){
				out.println("<br/>");
				out.println("<table border='1'>");
				out.println("<tr>");
				out.println("<td>名前</td>" + "<td>" + po.getName() + "</td>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>誕生日</td>" + "<td>" + po.getBirthDay() + "</td>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>年齢</td>" + "<td>" + po.getOld() + "</td>");
				out.println("</tr>");

				out.println("</table>");
			}
		}
	%>
	</div>
	<div id="rightSide">
    <h1>検索</h1>
    <br/>
	<%@ include file="contents/Search.jsp" %>
	<%
		ArrayList<ProfileObject> searchResultList = (ArrayList<ProfileObject>)request.getAttribute("searchResultList") ;
		if(searchResultList != null){
			for(ProfileObject po : searchResultList){
				out.println("<br/>");
				out.println("<table border='1'>");
				out.println("<tr>");
				out.println("<td>名前</td>" + "<td>" + po.getName() + "</td>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>誕生日</td>" + "<td>" + po.getBirthDay() + "</td>");
				out.println("</tr>");

				out.println("<tr>");
				out.println("<td>年齢</td>" + "<td>" + po.getOld() + "</td>");
				out.println("</tr>");

				out.println("</table>");
			}
		}
	%>
	</div>
</div>
</body>
</html>