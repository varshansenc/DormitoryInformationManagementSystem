package serviceimpl;

import java.sql.DriverManager;
import java.sql.SQLException;

import service.Connection;
import servlet.InitInfoServlet;

public class ConnectionImpl implements Connection{
	
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	java.sql.Connection conn=null;
	public ConnectionImpl() {
	}
	@Override
	public java.sql.Connection GetConnection() {
		try {
			driver=InitInfoServlet.getDriver();
			url=InitInfoServlet.getUrl()+"?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
			user=InitInfoServlet.getUser();
			pwd=InitInfoServlet.getPwd();
			Class.forName(driver);
			return DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
