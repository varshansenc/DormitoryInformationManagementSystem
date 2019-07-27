package dao;

import java.sql.SQLException;

import bean.User;

public interface UserDao {
	/**
	 * 根据用户名和密码查询用户信息
	 * @param id	用户名
	 * @param pwd	密码
	 * @return	放回查询到的用户信息
	 * @throws SQLException 
	 */
	User checkUserLoginDao(String id,String pwd);
	/**
	 * 向用户表中添加数据
	 * @param type
	 * @param id
	 * @param pwd
	 */
	void addUser(String type, String id, String pwd);
	
	/**
	 * 根据cookie信息查找用户信息
	 * @param id	账号
	 * @param type	用户类型
	 * @return	返回查找到的用户信息
	 */
	User checkCookieDao(String id, String type);
}
