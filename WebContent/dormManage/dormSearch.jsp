<%@page import="bean.BuildAdm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BuildAdm buildAdm=(BuildAdm)request.getAttribute("ff");
%>
    
<table>
  <caption>我的个人信息</caption>
  <tr>
    <th>宿舍管理员编号</th>
    <th>账号</th>
    <th>密码</th>
    <th>宿舍楼编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>电话号码</th>
  </tr>
  <tr>
    <td><%=buildAdm.getBuildadmno() %></td>
    <td><%=buildAdm.getBuildadmid() %></td>
    <td><%=buildAdm.getBuildadmpwd() %></td>
    <td><%=buildAdm.getBuildno() %></td>
    <td><%=buildAdm.getBuildadmname() %></td>
    <td><%=buildAdm.getBuildadmsex() %></td>
    <td><%=buildAdm.getBuildtel() %></td>
  </tr>
</table>
    
