<%@page import="java.util.List"%>
<%@page import="bean.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<AbsenceRecord> list=(List<AbsenceRecord>)request.getAttribute("ff");
%>    


<table style="width: 100%;text-align: center;">
  <caption>缺勤信息表</caption>
  <tr>
  	  <th>记录编号</th>
	  <th>学生编号</th>
	  <th>学生姓名</th>
	  <th>宿舍楼编号</th>
	  <th>宿舍号</th>
	  <th>日期</th>
	  <th>学生电话号码</th>
  </tr>
  
  <%
  for(int i=0;i<list.size();i++){
  %>
   <tr>
   		<td><%=list.get(i).getRecordno() %></td>
   		<td><%=list.get(i).getStuno() %></td>
   		<td><%=list.get(i).getStuname() %></td>
   		<td><%=list.get(i).getBuildno() %></td>
   		<td><%=list.get(i).getDormno() %></td>
   		<td><%=list.get(i).getRecorddate() %></td>
   		<td><%=list.get(i).getStutel() %></td>
   </tr>
   
   <%} %>
</table>
