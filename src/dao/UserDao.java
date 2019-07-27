package dao;

import java.sql.SQLException;

import bean.User;

public interface UserDao {
	/**
	 * �����û����������ѯ�û���Ϣ
	 * @param id	�û���
	 * @param pwd	����
	 * @return	�Żز�ѯ�����û���Ϣ
	 * @throws SQLException 
	 */
	User checkUserLoginDao(String id,String pwd);
	/**
	 * ���û������������
	 * @param type
	 * @param id
	 * @param pwd
	 */
	void addUser(String type, String id, String pwd);
	
	/**
	 * ����cookie��Ϣ�����û���Ϣ
	 * @param id	�˺�
	 * @param type	�û�����
	 * @return	���ز��ҵ����û���Ϣ
	 */
	User checkCookieDao(String id, String type);
}
