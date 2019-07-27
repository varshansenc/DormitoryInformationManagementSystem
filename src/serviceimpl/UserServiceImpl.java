package serviceimpl;

import bean.User;
import dao.UserDao;
import daoimpl.UserDaoImpl;
import service.UserService;

public class UserServiceImpl implements UserService{

	UserDao user=new UserDaoImpl(); 
	public UserServiceImpl() {}

	@Override
	public User checkUserLoginService(String id, String pwd) {
		return user.checkUserLoginDao(id, pwd);
	}

	@Override
	public void addUser(String type, String id, String pwd) {
		user.addUser(type,id,pwd);
	}

	@Override
	public User checkCookie(String id, String type) {
		return user.checkCookieDao(id,type);
	}
}