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
	            <li><img src="/w/images/png3.png" onclick="open1()"></li>
	            <li><img src="/w/images/png7.png" onclick="open2()"></li>
	            <li><img src="/w/images/png001.png" onclick="open3()"></li>
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
		<div class="content" id="content" style="width: 100%;height: auto;margin: 10px 0;display: none">
			<hr />
			<span style="width: 35%; direction: rtl;float: left;margin-right: 10px;font-size: 22px;font-family: '楷体';">查看个人信息</span><br><br>
			<span style="width: 35%; direction: rtl;float: left;margin-right: 10px;font-size: 22px;font-family: '楷体';">请输入你的学生编号</span>
			<form action="javascript:void(0)" method="post" onsubmit="searchStu1()">	
				<input type="text" id="stuno" name="stuno" style="width: 45%;height: 30px;background-color: rgb(251,242,227);border-style: none;border-radius: 2px;" /><br /><br />
				<input type="submit" class="class1" name="sure" value="查找" /><br /><br />
			</form>
		</div>
		
		
		<%
			String stuid=request.getParameter("loginuser");
    		String str=(request.getParameter("warning")!=null)?(String)request.getParameter("warning"):"";
    	%>
    			
		
		<div class="alterStu" id="alterStu" style="display: none;">
			<hr />
			<form action="javascript:void(0)" method="post" onsubmit="alterStuInfo()">	
				<span>修改个人信息</span><br><br>
				<span>请输入你的学生编号</span>
				<input name="stuno2" type="text" id="stuno2"><br/><br>
				<span>请输入要修改的字段名</span>
				<input name="stufieldname" type="text" id="stufieldname"><br/><br>
				<span>请输入修改后的值</span>
				<input name="stufieldvalue" type="text" id="stufieldvalue"><br/><br>
				<input type="submit" class="alterStus" value="修改">
			</form>	
		</div>
		
		<div class="searchRecord1" id="searchRecord1">
			<hr />
			<form action="javascript:void(0)" method="post" onsubmit="searchStuRecord()">	
				<span>显示我的缺勤记录</span><br><br>
				<span>请输入你的学生编号</span>
				<input name="stuno1" type="text" id="stuno1"><br/><br>
				<input type="submit" class="searchRecords" value="查找">
			</form>	
		</div>
		
		<div class="answer" id="answer">
			
		</div>		
	
	</div>
	
	<span class="display" id="display"><b><i><%=str %></i></b></span><%  %><%--  --%>
	
	</div>

	<div style="background-color: rgba(0,0,0);color: white;" class="loginbm">版权所有  2018  <a href="http://jwc.zua.edu.cn">郑州航院</a>  仅供学习交流，勿用于任何商业用途</div>

</body>



<script type="text/javascript" src="/w/js/jquery.js"></script>
<script type="text/javascript" src="/w/js/calendar.js"></script>
<script type="text/javascript" src="/w/js/ajax.js"></script>
<script type="text/javascript" src="/w/js/lunbo.js"></script>
</html>
