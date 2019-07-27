package daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {}
	//根据用户名和密码查询用户信息
	@Override
	public User checkUserLoginDao(String id, String pwd){
		//声明jdbc对象
		service.Connection connection=new serviceimpl.ConnectionImpl();
		java.sql.Connection connection2=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		//声明变量
		User user=null;
		//获取连接
		connection2=connection.GetConnection();
		//System.out.println(connection2);
		
		//创建查询语句
		String sql="select * from user where id=? and pwd=?";
		//创建sql命令对象
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//给占位符赋值
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			//执行sql语句
			resultSet=preparedStatement.executeQuery();
			//遍历结果集
			while (resultSet.next()) {
				user=new User();
				user.setType(resultSet.getString("type"));
				user.setId(resultSet.getString("id"));
				user.setPwd(resultSet.getString("pwd"));
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public void addUser(String type, String id, String pwd) {
		service.Connection connection=new serviceimpl.ConnectionImpl();
		java.sql.Connection connection2=null;
		PreparedStatement preparedStatement=null;
		//获取连接
		connection2=connection.GetConnection();
		
		//创建更新语句
		String sql="insert into user values(?,?,?)";
		//创建sql命令对象
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//给占位符赋值
			preparedStatement.setString(1, type);
			preparedStatement.setString(2, id);
			preparedStatement.setString(3, pwd);
			//执行sql语句
			int i=preparedStatement.executeUpdate();
			if (i==1) {
				System.out.println("插入成功！");
			}else {
				System.out.println("插入失败！");
			}
			preparedStatement.close();
			connection2.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}
	@Override
	public User checkCookieDao(String id, String type) {
		//声明jdbc对象
		service.Connection connection=new serviceimpl.ConnectionImpl();
		java.sql.Connection connection2=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		//声明变量
		User user=null;
		//获取连接
		connection2=connection.GetConnection();
		//System.out.println(connection2);
		
		//创建查询语句
		String sql="select * from user where id=? and type=?";
		//创建sql命令对象
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//给占位符赋值
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, type);
			//执行sql语句
			resultSet=preparedStatement.executeQuery();
			//遍历结果集
			while (resultSet.next()) {
				user=new User();
				user.setType(resultSet.getString("type"));
				user.setId(resultSet.getString("id"));
				user.setPwd(resultSet.getString("pwd"));
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
		
	}
}
