package service;

import bean.User;

public interface UserService {
	/**
	 * 校验用户登录
	 * @param id 账号
	 * @param pwd 密码
	 * @return	返回查询到的用户信息
	 */
	User checkUserLoginService(String id,String pwd);

	/**
	 * 向用户表中添加数据
	 * @param type
	 * @param id
	 * @param pwd
	 */
	void addUser(String type, String id, String pwd);
	
	/**
	 * 根据cookie信息查找用户
	 * @param id 账号
	 * @param type	用户类型
	 * @return	返回查找到的用户信息
	 */
	User checkCookie(String id,String type);

}
