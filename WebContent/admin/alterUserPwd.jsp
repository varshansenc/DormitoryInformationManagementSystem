<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String str=(Integer)request.getAttribute("ff")==0?"Modify faild":"Modify successfully";
%>

<span style="color: red;font-size: 36px;"><b><i><%=str %></i></b></span>