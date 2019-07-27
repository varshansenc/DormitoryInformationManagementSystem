<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="/w/css/style.css" rel="stylesheet" type="text/css" />
<link href="/w/css/calendar.css" rel="stylesheet" type="text/css">

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
	            <li><img src="/w/images/png018.png" onclick="open19()"></li>
	            <li><img src="/w/images/png3.png" onclick="open11()"></li>
	            <li><img src="/w/images/png7.png" onclick="open12()"></li>
	            <li><img src="/w/images/png4.png" onclick="open13()"></li>
	            <li><img src="/w/images/png003.png" onclick="open15()"></li>
	            <li><img src="/w/images/png004.png" onclick="open16()"></li>
	            <li><img src="/w/images/png005.png" onclick="open17()"></li>
	            <li><img src="/w/images/png006.png" onclick="open18()"></li>
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
		<input type="button" name="sure" value="确定" onclick="deleteAR1()"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" name="cancel" value="取消" onclick="closeDialog1()"/>
    </div> 
    <div id="fade1" class="black_overlay"></div>
        
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
	
		<div class="importFile" id="importFile">
	    	<hr/>
			<form action="/w/ImportFileServlet" method="post" enctype="multipart/form-data">	
				<span>导入学生信息</span><br><br>
				<input name="importStu" type="file" id="importStu" ><br/><br>
				<input type="submit" class="importFiles" value="导入">
			</form>	
		</div>
	
		<div class="searchBuildAdm" id="searchBuildAdm">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="searchBuildAdm1()">	
				<span>显示我的个人信息</span><br><br>
				<span>请输入你的宿舍管理员编号</span>
				<input name="buildadmno" type="text" id="buildadmno" autocomplete="off"><br/><br>
				<input type="submit" class="searchBuildAdms" value="查找">
			</form>	
		</div>
		
		<div class="alterBuildAdm" id="alterBuildAdm">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterBuildAdmInfo()">	
				<span>修改个人信息</span><br><br>
				<span>请输入你的宿舍管理员编号</span>
				<input name="buildadmno1" type="text" id="buildadmno1"><br/><br>
				<span>请输入要修改的字段名</span>
				<input name="buildadmfieldname" type="text" id="buildadmfieldname"><br/><br>
				<span>请输入修改后的值</span>
				<input name="buildadmfieldvalue" type="text" id="buildadmfieldvalue"><br/><br>
				<input type="submit" class="alterBuildAdms" value="修改">
			</form>	
		</div>
		
		<div class="displayStu" id="displayStu">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="displayStu1()">	
				<span>显示学生信息表</span><br><br>
				<input type="submit" class="displayStus" value="显示">
			</form>	
		</div>
		
		<div class="displayAbsenceRecord" id="displayAbsenceRecord">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="displayAbsenceRecord1()">	
				<span>显示缺勤记录表</span><br><br>
				<input type="submit" class="displayAbsenceRecords" value="显示">
			</form>	
		</div>
		
		<div class="addAbsenceRecord" id="addAbsenceRecord">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="addAbsenceRecord1()">	
				<span>增加缺勤记录</span><br><br>
				<span>请输入缺勤记录编号</span>
				<input name="AbsenceRecordno" type="text" id="AbsenceRecordno"><br/><br>
				<span>请输入学生编号</span>
				<input name="stuno" type="text" id="stuno"><br/><br>
				<span>请输入学生姓名</span>
				<input name="stuname" type="text" id="stuname"><br/><br>
				<span>请输入宿舍楼编号</span>
				<input name="buildno" type="text" id="buildno"><br/><br>
				<span>请输入宿舍号</span>
				<input name="dormno" type="text" id="dormno"><br/><br>
				<span>请输入日期</span>
				<input name="recorddate" type="text" id="recorddate"><br/><br>
				<span>请输入电话号码</span>
				<input name="stutel" type="text" id="stutel"><br/><br>
				<input type="submit" class="addAbsenceRecords" value="添加">
			</form>	
		</div>
		
	  
		
		<div class="deleteAR" id="deleteAR">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="openDialog1()">	
				<span>删除缺勤记录</span><br><br>
				<span>请输入缺勤记录编号</span>
				<input name="absenceRecordno1" type="text" id="absenceRecordno1" autocomplete="off"><br/><br>
				<input type="submit" class="deleteARs" value="删除">
			</form>	
		</div>
		
		
		<div class="alterAR" id="alterAR">
	    	<hr/>
			<form action="javascript:void(0)" method="post" onsubmit="alterAR1()">	
				<span>修改缺勤记录</span><br><br>
				<span>请输入缺勤记录编号</span>
				<input name="absenceRecordno2" type="text" id="absenceRecordno2"><br/><br>
				<span>请输入要修改的字段名</span>
				<input name="ARfieldname" type="text" id="ARfieldname"><br/><br>
				<span>请输入修改后的值</span>
				<input name="ARfieldvalue" type="text" id="ARfieldvalue"><br/><br>
				<input type="submit" class="alterARs" value="修改">
			</form>	
		</div>
		
		
		<div class="answer" id="answer">
			
		</div>		
	
	</div>
	
	<span class="display" id="display"><b><i><%=str %></i></b></span>

	</div>

	<div style="background-color: rgba(0,0,0);color: white;" class="loginbm">版权所有  2018  <a href="http://jwc.zua.edu.cn">郑州航院</a>  仅供学习交流，勿用于任何商业用途</div>

</body>

<script type="text/javascript" src="/w/js/calendar.js"></script>
<script type="text/javascript" src="/w/js/ajax.js"></script>
<script type="text/javascript" src="/w/js/lunbo.js"></script>
</html>
