<%@page import="bean.SysAdm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	SysAdm sysadm=(SysAdm)request.getAttribute("ff");
	System.out.println(sysadm);
%>

<table>
	<caption>我的个人信息</caption>
	<tr>
		<th>系统管理员编号</th>
		<th>账号</th>
		<th>密码</th>
		<th>姓名</th>
		<th>性别</th>
		<th>电话号码</th>
	</tr>
	<%if(sysadm!=null){ %>
	<tr>
		<td><%=sysadm.getSysno() %></td>
		<td><%=sysadm.getSysid() %></td>
		<td><%=sysadm.getSyspwd() %></td>
		<td><%=sysadm.getSysname() %></td>
		<td><%=sysadm.getSyssex() %></td>
		<td><%=sysadm.getSystel() %></td>
	</tr>
	<%} %>
</table>