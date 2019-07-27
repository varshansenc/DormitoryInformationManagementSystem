<%@page import="serviceimpl.UserServiceImpl"%>
<%@page import="bean.User" %>
<%@page import="service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎使用宿舍管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script src="js/common.js"></script>

</head>

<body style="background-color:#df7611; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">

	<%
		String id="";
		String type="";
		UserService userService=new UserServiceImpl();
		Cookie[] cks=request.getCookies();
		if(cks != null){
			for(Cookie cookie:cks){
				if("id".equals(cookie.getName())){
					id=cookie.getValue();
				}
				if("type".equals(cookie.getName())){
					type=cookie.getValue();
				}
			}
			if(id != null && type != null){
				User user=userService.checkCookie(id,type);
				if(user != null){
					if("stu".equals(user.getType())){
						request.getRequestDispatcher("student/mainStudent.jsp").forward(request, response);
					}
					if("buildadm".equals(user.getType())){
						request.getRequestDispatcher("dormManage/mainManage.jsp").forward(request, response);
					}
					if("sysadm".equals(user.getType())){
						request.getRequestDispatcher("admin/mainAdmin.jsp").forward(request, response);
					}
				}
			}	
		}
		
	%>

    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎使用宿舍管理系统</span>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox loginbox3">
    <form action="login" method="post">
    	<input type="hidden" name="oper" value="login"/>
	    <ul style="margin-top: 90px;">
	    <li><input name="loginuser" type="text" class="loginuser" placeholder="username"/></li>
	    <li><input name="loginpwd" type="password" class="loginpwd" placeholder="password"/></li>
	    <li>
			<span style="font-size: 20px;color: gray;"><input name="type" type="radio" value="stu"/>学生<input name="type" type="radio" value="buildadm"/>宿舍管理员<input name="type" type="radio" value="sysadm"/>系统管理员</span> 
	    </li>
	    <li><input name="login" type="submit" class="loginbtn" value="登录" />
	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <input name="regester" type="submit" class="loginbtn" onclick="regeste()" value="注册"  />
	    <%
    		String str=null;
	    	str=(request.getParameter("str")!=null)?(String)request.getParameter("str"):"";
    	%>
    	<span style="color: red;font-size: 25px"><b><i><%=str %></i></b></span>
	    </ul>
    </form>
    	
    </div>
    
    </div>
    
    
    <div class="loginbm">版权所有  2018  <a href="http://jwc.zua.edu.cn">郑州航院</a>  仅供学习交流，勿用于任何商业用途</div>
	
    
</body>

</html>