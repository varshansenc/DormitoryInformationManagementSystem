<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.*,bean.Build" %>   
<%@page import="java.util.List"%>
    
<% 
	List<Build> list=(List<Build>)request.getAttribute("ff");
	System.out.println(list);
%>

<table>
	<caption>宿舍楼信息</caption>
	<tr>
		<td>宿舍楼编号</td>
		<td>宿舍管理员编号</td>
		<td>宿舍楼类型</td>
		<td>学生人数</td>
		<td>电话号码</td>
	</tr>
	<%for(int i=0;i<list.size();i++) {%>
	<tr>
		<td><%=list.get(i).getBuildno() %></td>
		<td><%=list.get(i).getBuildadmno() %></td>
		<td><%=list.get(i).getDormtype() %></td>
		<td><%=list.get(i).getStucount() %></td>
		<td><%=list.get(i).getTel() %></td>
	</tr>
	<%} %>
</table>