<%@page import="java.util.List"%>
<%@page import="bean.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<Stu> list=(List<Stu>)request.getAttribute("ff");

%>    


<table style="width: 100%;text-align: center;">
  <caption>我的个人信息</caption>
  <tr>
  	  <th>学生编号</th>
	  <th>账号</th>
	  <th>密码</th>
	  <th>宿舍楼编号</th>
	  <th>宿舍号</th>
	  <th>姓名</th>
	  <th>性别</th>
	  <th>电话号码</th>
  </tr>
  
  <%
  for(int i=0;i<list.size();i++){
  %>
   <tr>
   		<td><%=list.get(i).getStuno() %></td>
   		<td><%=list.get(i).getStuid() %></td>
   		<td><%=list.get(i).getStupwd() %></td>
   		<td><%=list.get(i).getStuname() %></td>
   		<td><%=list.get(i).getBuildno() %></td>
   		<td><%=list.get(i).getDormno() %></td>
   		<td><%=list.get(i).getStusex() %></td>
   		<td><%=list.get(i).getStutel() %></td>
   </tr>
   
   <%} %>
</table>
