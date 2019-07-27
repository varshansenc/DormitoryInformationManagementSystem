<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ResultSet resultSet=(ResultSet)request.getAttribute("ff");
	System.out.println(resultSet);
%>  
 
 <table>
 	<caption>我的缺勤记录</caption>
 	<tr>
 		<td>记录编号</td>
 		<td>学生编号</td>
 		<td>学生姓名</td>
 		<td>宿舍楼编号</td>
 		<td>宿舍号</td>
 		<td>日期</td>
 		<td>学生电话号码</td>
 	</tr>
 	
 	<% while(resultSet.next()){ %>
 	<tr>
 		<td><%=resultSet.getString(1) %></td>
 		<td><%=resultSet.getString(2) %></td>
 		<td><%=resultSet.getString(3) %></td>
 		<td><%=resultSet.getString(4) %></td>
 		<td><%=resultSet.getString(5) %></td>
 		<td><%=resultSet.getString(6) %></td>
 		<td><%=resultSet.getString(7) %></td>
 	</tr>
 	<% } %>
 	
</table>