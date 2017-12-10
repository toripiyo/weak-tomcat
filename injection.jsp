<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<div>
<section>
<form action="/app/injection" method="post">
<h3>OWASP Top10 A1-Injection</h3>
<p>You can find your favorite book with title</p>
<input type="text" name="title">
<br>
<input type="submit" value="Submit">
</form>
</section>
<div><%= request.getAttribute("message") %></div>
<div><%= request.getAttribute("result") %></div>
<%-- <div><%= request.getAttribute("result").getRow() %></div> --%>
<%
  ResultSet result = request.getAttribute("result");
%>

<section>
<table border="1">
<%-- <%
    while (request.getAttribute("result").next()) {
%>

<tr>
    <td> <%= result.getString(1) %></td>
    <td> <%= result.getString(2) %></td>
</tr>

<%
    }
%> --%>
</table>
</section>
</div>
