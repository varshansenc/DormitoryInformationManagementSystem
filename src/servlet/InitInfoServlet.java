package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/InitInfoServlet")
public class InitInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	
	public void init() {
		ServletConfig config=this.getServletConfig();
		driver=config.getInitParameter("driver");
		url=config.getInitParameter("url");
		user=config.getInitParameter("user");
		pwd=config.getInitParameter("pwd");
	}
	
	public InitInfoServlet() {
		// TODO Auto-generated constructor stub
	}
	public static String getDriver() {
		return driver;
	}
	public static String getUrl() {
		return url;
	}
	public static String getUser() {
		return user;
	}
	public static String getPwd() {
		return pwd;
	}
}
