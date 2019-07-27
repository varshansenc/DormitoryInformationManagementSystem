<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="/w/css/style.css" rel="stylesheet" type="text/css" />
<link href="/w/css/calendar.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="/w/js/jquery.js"></script>
<script src="/w/js/common.js"></script>
<script type="text/javascript" src="/w/js/open.js"></script>
<script type="text/javascript" src="/w/js/time.js"></script>


</head>

<body onload="startTime()">


    <div class="topleft" style="float: left;">
    <a href="mainAdmin.jsp" target="_parent"><img src="/w/images/logo3.png" title="系统首页" /></a>
    </div>
        
    
	  <div class="box" id="box">
	    <div class="inner">
	        <ul class="lunbo">
	            <li><img src="/w/images/png3.png" onclick="open111()"></li>
	            <li><img src="/w/images/png7.png" onclick="open112()"></li>
	            <li><img src="/w/images/png007.png" onclick="open113()"></li>
	            <li><img src="/w/images/png008.png" onclick="open114()"></li>
	            <li><img src="/w/images/png009.png" onclick="open115()"></li>
	            <li><img src="/w/images/png010.png" onclick="open116()"></li>
	            <li><img src="/w/images/png011.png" onclick="open117()"></li>
	            <li><img src="/w/images/png012.png" onclick="open118()"></li>
	        </ul>
	 
	       <ol class="bar">
	        </ol>
	    
	        <div id="arr">
	            <span id="left"><</span>
	            <span id="right">></span>
	        </div>
	 
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
        
    <div id="light1" class="white_content">
        <span>确定要删除吗？</span><br />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;
		<input type="button" name="sure" value="确定" onclick="deleteBuild1()"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" name="cancel" value="取消" onclick="closeDialog1()"/>
    </div> 
    <div id="fade1" class="black_overlay"></div>
    
     <div id="light2" class="white_content">
        <span>确定要删除吗？</span><br />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;
		<input type="button" name="sure" value="确定" onclick="deleteUser1()"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" name="cancel" value="取消" onclick="closeDialog2()"/>
    </div> 
    <div id="fade2" class="black_overlay"></div>    
        
    <div class="maintopright">
		<input type="button" name="e1" id="e1" value="退出" onclick="openDialog()"/>
	</div>


	<div class="left" id="left">
	
		<h2><pre>  Welcome to use
  the dormitory 
   management 
     system</pre></h2>
     <hr>
		<div id="data" class="data">
			<p>
				<span id="prev" class="prev">上一月</span>              
				<span id="nian" class="nian">2018</span>
				<span id="next" class="next">下一月</span>            
			</p>
			<h5 id="yue" class="yue">一月</h5>
			<ul id="title" class="title">
				<li>日</li>
				<li>一</li>
				<li>二</li>
				<li>三</li>
				<li>四</li>
				<li>五</li>
				<li>六</li>             
			</ul>
			<ul id="date" class="date"></ul>
		</div>
		
	
	</div>
	
	<div class="right" id="right">
		<div id="txt" class="txt"></div>
		<hr>
		<div class="search" id="search">
		
			<form  method="get" action="http://www.baidu.com">
				<input type="text" placeholder="search in baidu"/>
				<input type="submit" value="百度一下">
			</form>
			<form  method="get" action="https://www.google.com/ncr">
				<input type="text" placeholder="search in google"/>
				<input type="submit" value="google">
			</form>
		</div>
		<hr>
		
		<div class="other">
			<p>友情链接</p>
			<ul>
				<li><a href="http://www.baidu.com">百度一下</a></li>
				<li><a href="http://www.google.com/ncr">google</a></li>
				<li><a href="http://jwc.zua.edu.cn">郑航教务处</a></li>
				<li><a href="http://10.30.0.77:89/">图书检索</a></li>
			</ul>
		</div>
	
	</div>



	<div class="center">
	 <div class="center1">
		<%
			String stuid=request.getParameter("loginuser");
   			String str=(request.getParameter("warning")!=null)?(String)request.getParameter("warning"):"";
   		%>

		<div class="searchSysAdm" id="searchSysAdm">
			<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="searchSysAdm1()">	
				<span>显示我的个人信息</span><br><br>
				<span>请输入你的系统管理员编号</span>
				<input name="sysadmno" type="text" id="sysadmno" autocomplete="off"><br/><br>
				<input type="submit" class="searchSysAdms" value="查找">
			</form>	
		</div>
	
	    <div class="alterSysAdm" id="alterSysAdm">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterSysAdm1()">	
				<span>修改个人信息</span><br><br>
				<span>请输入系统管理员编号</span>
				<input name="sysadmno1" type="text" id="sysadmno1"><br/><br>
				<span>请输入要修改的字段名</span>
				<input name="Sysfieldname" type="text" id="Sysfieldname"><br/><br>
				<span>请输入修改后的值</span>
				<input name="Sysfieldvalue" type="text" id="Sysfieldvalue"><br/><br>
				<input type="submit" class="alterSysAdms" value="修改">
			</form>	
		</div>
	
		
		<div class="addBuild" id="addBuild">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="addBuild1()">	
				<span>增加宿舍楼信息</span><br><br>
				<span>请输入宿舍楼编号</span>
				<input name="buildno" type="text" id="buildno"><br/><br>
				<span>请输入宿舍管理员编号</span>
				<input name="buildadmno" type="text" id="buildadmno"><br/><br>
				<span>请输入宿舍楼类型</span>
				<input name="buildtype" type="text" id="buildtype"><br/><br>
				<span>请输入学生数</span>
				<input name="stucount" type="text" id="stucount"><br/><br>
				<span>请输入电话号码</span>
				<input name="tel" type="text" id="tel"><br/><br>
				<input type="submit" class="addBuilds" value="添加">
			</form>	
		</div>
	
		<div class="displayBuild" id="displayBuild">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="displayBuild1()">	
				<span>显示所有宿舍楼信息</span><br><br>
				<input type="submit" class="displayBuilds" value="查找">
			</form>	
		</div>
	
		<div class="alterBuild" id="alterBuild">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterBuild1()">	
				<span>修改宿舍楼信息</span><br><br>
				<span>请输入宿舍楼编号</span>
				<input name="Buildno1" type="text" id="Buildno1"><br/><br>
				<span>请输入要修改的字段名</span>
				<input name="Buildfieldname" type="text" id="Buildfieldname"><br/><br>
				<span>请输入修改后的值</span>
				<input name="Buildfieldvalue" type="text" id="Buildfieldvalue"><br/><br>
				<input type="submit" class="alterBuilds" value="修改">
			</form>	
		</div>
	
		<div class="deleteBuild" id="deleteBuild">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="openDialog1()">	
				<span>删除宿舍楼信息</span><br><br>
				<span>请输入要删除的宿舍楼编号</span>
				<input name="buildno2" type="text" id="buildno2" autocomplete="off"><br/><br>
				<input type="submit" class="deleteBuilds" value="删除">
			</form>	
		</div>	
	
		<div class="alterUser" id="alterUser">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterUser1()">	
				<span>修改用户密码</span><br><br>
				<span>请输入用户类型</span>
				<input name="type1" type="text" id="type1"><br/><br>
				<span>请输入用户账号</span>
				<input name="username1" type="text" id="username1"><br/><br>
				<span>请输入新密码</span>
				<input name="pwd" type="text" id="pwd"><br/><br>
				<input type="submit" class="alterUsers" value="修改">
			</form>	
		</div>
	
		<div class="deleteUser" id="deleteUser">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterUser1()">	
				<span>删除用户信息</span><br><br>
				<span>请输入要删除的用户类型</span>
				<input name="type" type="text" id="type" autocomplete="off"><br/><br>
				<span>请输入要删除的用户账号</span>
				<input name="username" type="text" id="username" autocomplete="off"><br/><br>
				<input type="submit" class="deleteUsers" value="删除">
			</form>	
		</div>	
	
		<div class="answer" id="answer"></div>
		
	 </div>	
		
	<span class="display" id="display"><b><i><%=str %></i></b></span>
	</div>

	<div style="background-color: rgba(0,0,0);color: white;" class="loginbm">版权所有  2018  <a href="http://jwc.zua.edu.cn">郑州航院</a>  仅供学习交流，勿用于任何商业用途</div>

</body>
<script type="text/javascript" src="/w/js/jquery.js"></script>
<script type="text/javascript" src="/w/js/calendar.js"></script>
<script type="text/javascript" src="/w/js/ajax.js"></script>
<script type="text/javascript" src="/w/js/lunbo.js"></script>
</html>
