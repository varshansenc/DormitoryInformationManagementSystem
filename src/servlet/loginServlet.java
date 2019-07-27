package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import service.UserService;
import serviceimpl.UserServiceImpl;
/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//获取操作符
		String oper=req.getParameter("oper");
		String id=req.getParameter("loginuser");
		String pwd=req.getParameter("loginpwd");
		String type=req.getParameter("type");
		if (!"".equals(id) && !"".equals(pwd) && type != null) {
			if ("login".equals(oper)) {
				//调用登录处理方法
				checkUserLogin(req,resp);
			}
			else if("regeste".equals(oper)) {
				addUser(req,resp);
			}
		} else {
			resp.sendRedirect("/w/index.jsp?str=Please enter your account number, password and account type!");
		}
		
	}
	//处理注册
	private void addUser(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		//获取请求信息
		String id=req.getParameter("loginuser");
		String pwd=req.getParameter("loginpwd");
		String type=req.getParameter("type");
		System.out.println(id+":"+pwd+":"+type);
		//处理请求信息
		//获取service对象
		UserService userService=new UserServiceImpl();
		userService.addUser(type,id,pwd);
		if ("stu".equals(type)) {
			//resp.sendRedirect("/w/student/regesteStudent.jsp");
			req.getRequestDispatcher("/student/regesteStudent.jsp").forward(req, resp);
		}else if ("buildadm".equals(type)) {
			req.getRequestDispatcher("/dormManage/regesteManage.jsp").forward(req, resp);
			//resp.sendRedirect("/w/dormManage/regesteManage.jsp");
		} else {
			req.getRequestDispatcher("/admin/regesteAdmin.jsp").forward(req, resp);
			//resp.sendRedirect("/w/admin/regesteAdmin.jsp");
		}
	}

	//处理登录
	private void checkUserLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		//获取请求信息
		String id=req.getParameter("loginuser");
		String pwd=req.getParameter("loginpwd");
		String type=req.getParameter("type");
		System.out.println(id+":"+pwd+":"+type);
		//处理请求信息
		//获取service对象
		UserService userService=new UserServiceImpl();
		//校验
		User user=userService.checkUserLoginService(id, pwd);
		
		System.out.println(user);
		if (user != null) {
			Cookie cookie=new Cookie("id", id);
			Cookie cookie2=new Cookie("type", type);
			cookie.setMaxAge(3*24*3600);
			cookie2.setMaxAge(3*24*3600);
			cookie.setPath("index.jsp");
			cookie2.setPath("index.jsp");
			//resp.addCookie(cookie);
			//resp.addCookie(cookie2);
			if (type.equals(user.getType())) {
				try {
					if ("stu".equals(type)) {
						req.getRequestDispatcher("/student/mainStudent.jsp").forward(req, resp);
					}else if("buildadm".equals(type)){
						req.getRequestDispatcher("/dormManage/mainManage.jsp").forward(req, resp);
						//resp.sendRedirect("/w/dormManage/mainManage.jsp");
					}else if("sysadm".equals(type)){
						req.getRequestDispatcher("/admin/mainAdmin.jsp").forward(req, resp);
						//resp.sendRedirect("/w/admin/mainAdmin.jsp");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				resp.sendRedirect("/w/index.jsp?str=User type selection error!");
			}
		}else {
			resp.sendRedirect("/w/index.jsp?str=Incorrect user name or password!");
		}
	}
}
