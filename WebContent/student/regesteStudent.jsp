<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎使用宿舍管理系统</title>
<link href="/w/css/style.css" rel="stylesheet" type="text/css" />
<script src="/w/js/jquery.js"></script>
<script src="/w/js/cloud.js" type="text/javascript"></script>
<script src="/w/js/common.js"></script>

</head>

<body style="background-color:#df7611; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  
    <div class="logintop">    
	    <span>欢迎使用宿舍管理系统</span>    
	     <div class="logintopright">
	    	<input type="button" name="exit" id="exit" value="退出" onclick="openDialog()"/>
	    </div>
    </div>
        <div id="light" class="white_content">
           <span>确定要退出吗？</span><br />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;
			<input type="button" name="sure" value="确定" onclick="window.location='/w/index.jsp'"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" name="cancel" value="取消" onclick="closeDialog()"/>
        </div> 
        <div id="fade" class="black_overlay"></div>
	
	
	<%
		String username=request.getParameter("loginuser");
		String pwd=request.getParameter("loginpwd");
		String path="/w/regeste?type=stu&stuid="+username+"&stupwd="+pwd;
	%>
	
	<div class="regeste">
	<form action=<%=path %> method="post">
		<ul>
			<li>
				<span id="key">学生编号</span>
				<input id="value" name="stuno" type="text" placeholder="001"></input>
			</li>
			<li>
				<span id="key">姓名</span>
				<input id="value" name="stuname" type="text" placeholder="小明"></input>
			</li>
			<li>
				<span id="key">宿舍楼编号</span>
				<input id="value" name="buildno" type="text" placeholder="01"></input>
			</li>
			<li>
				<span id="key">宿舍编号</span>
				<input id="value" name="dormno" type="text" placeholder="101"></input>
			</li>
			<li>
				<span id="key">性别</span>
				<input id="value" name="stusex" type="text" placeholder="0"></input>
			</li>
			<li>
				<span id="key">电话</span>
				<input id="value" name="stutel" type="text" placeholder="1234567890"></input>
			</li>
			<%
				String str=(String)request.getParameter("warning");
				str=(str!=null)?str:"";
			%>
			<span style="color: blue;"><i><%=str %></i></span>
			<input type="button" value="" style="opacity: 0;"/><br />
			<input id="input" type="submit" value="注册" /><br />
			<input type="button" value="" style="opacity: 0;"/>
		</ul>	
			
	</form>
	</div>
		

 	<div class="loginbm">版权所有  2018  <a href="http://jwc.zua.edu.cn">郑州航院</a>  仅供学习交流，勿用于任何商业用途</div>
	

</body>

</html>

