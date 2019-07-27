package service;

import bean.User;

public interface UserService {
	/**
	 * У���û���¼
	 * @param id �˺�
	 * @param pwd ����
	 * @return	���ز�ѯ�����û���Ϣ
	 */
	User checkUserLoginService(String id,String pwd);

	/**
	 * ���û������������
	 * @param type
	 * @param id
	 * @param pwd
	 */
	void addUser(String type, String id, String pwd);
	
	/**
	 * ����cookie��Ϣ�����û�
	 * @param id �˺�
	 * @param type	�û�����
	 * @return	���ز��ҵ����û���Ϣ
	 */
	User checkCookie(String id,String type);

}
