package daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {}
	//�����û����������ѯ�û���Ϣ
	@Override
	public User checkUserLoginDao(String id, String pwd){
		//����jdbc����
		service.Connection connection=new serviceimpl.ConnectionImpl();
		java.sql.Connection connection2=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		//��������
		User user=null;
		//��ȡ����
		connection2=connection.GetConnection();
		//System.out.println(connection2);
		
		//������ѯ���
		String sql="select * from user where id=? and pwd=?";
		//����sql�������
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//��ռλ����ֵ
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pwd);
			//ִ��sql���
			resultSet=preparedStatement.executeQuery();
			//���������
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
		//��ȡ����
		connection2=connection.GetConnection();
		
		//�����������
		String sql="insert into user values(?,?,?)";
		//����sql�������
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//��ռλ����ֵ
			preparedStatement.setString(1, type);
			preparedStatement.setString(2, id);
			preparedStatement.setString(3, pwd);
			//ִ��sql���
			int i=preparedStatement.executeUpdate();
			if (i==1) {
				System.out.println("����ɹ���");
			}else {
				System.out.println("����ʧ�ܣ�");
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
		//����jdbc����
		service.Connection connection=new serviceimpl.ConnectionImpl();
		java.sql.Connection connection2=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		//��������
		User user=null;
		//��ȡ����
		connection2=connection.GetConnection();
		//System.out.println(connection2);
		
		//������ѯ���
		String sql="select * from user where id=? and type=?";
		//����sql�������
		try {
			preparedStatement=connection2.prepareStatement(sql);
			//��ռλ����ֵ
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, type);
			//ִ��sql���
			resultSet=preparedStatement.executeQuery();
			//���������
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
