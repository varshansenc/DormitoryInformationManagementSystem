<%@ page import="bean.Stu" contentType="text/html; charset=utf-8" %>

<%
	Stu stu=(Stu)request.getAttribute("ff");
	String[] s=new String[8];
	s[0]=stu.getStuno();
	s[1]=stu.getStuid();
	s[2]=stu.getStupwd();
	s[3]=stu.getBuildno();
	s[4]=stu.getDormno();
	s[5]=stu.getStuname();
	s[6]=stu.getStusex()+"";
	s[7]=stu.getStutel();
	System.out.println(stu);
%>

<table style="width: 100%;text-align: center;">
  <caption>我的个人信息</caption>
  <tr>
  	  <td>学生编号</td>
	  <td>账号</td>
	  <td>密码</td>
	  <td>宿舍楼编号</td>
	  <td>宿舍号</td>
	  <td>姓名</td>
	  <td>性别</td>
	  <td>电话号码</td>
  </tr>
  <tr>
  <%
  for(int i=0;i<s.length;i++){
  %>
    <td><%=s[i] %></td>
    <%} %>
   </tr>
</table>
