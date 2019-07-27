package daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.Stu;
import dao.StuDao;

public class StuDaoImpl implements StuDao {

	service.Connection connection=new serviceimpl.ConnectionImpl();
	java.sql.Connection connection2=null;
	String sql=null;
	PreparedStatement preparedStatement=null;
	public StuDaoImpl() {}

	@Override
	public boolean addStu(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel) {
		boolean flag=false;
		sql="insert into stu values(?,?,?,?,?,?,?,?)";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, stuno);
			preparedStatement.setString(2, stuid);
			preparedStatement.setString(3, stupwd);
			preparedStatement.setString(4, stuname);
			preparedStatement.setString(5, buildno);
			preparedStatement.setString(6, dormno);
			preparedStatement.setInt(7, Integer.parseInt(stusex));
			preparedStatement.setString(8, stutel);
			flag=preparedStatement.executeUpdate()==1;
			System.out.println("≤Â»Î"+flag);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	Stu stu=new Stu();

	@Override
	public Stu searchStuDao(String stuno) {
		sql="select * from stu where stuno=?";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, stuno);
			System.out.println(preparedStatement);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				stu.setStuno(stuno);
				stu.setStuid(resultSet.getString(2));
				stu.setStupwd(resultSet.getString(3));
				stu.setStuname(resultSet.getString(4));
				stu.setBuildno(resultSet.getString(5));
				stu.setDormno(resultSet.getString(6));
				stu.setStusex(resultSet.getInt(7));
				stu.setStutel(resultSet.getString(8));
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public int updateStuDao(String stuno, String string3, String stufieldvalue){
		int i=0;
		sql="update stu set "+string3+"='"+stufieldvalue+"' where stuno='"+stuno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			i=preparedStatement.executeUpdate();
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i+"sfafsa");
		return i;
	}

	@Override
	public ResultSet searchStuRecordDao(String stuno) {
		ResultSet absenceRecords = null;
		sql="select * from absencerecord where stuno='"+stuno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			absenceRecords=preparedStatement.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return absenceRecords;
	}

	@Override
	public int insertStu(List<List<String>> stus) {
		int n=0;
		sql="insert into stu values(?,?,?,?,?,?,?,?)";
		connection2=connection.GetConnection();
		try {
			preparedStatement=connection2.prepareStatement(sql);
		
			for (List<String> list : stus) {
				preparedStatement.setString(1, list.get(0));
				preparedStatement.setString(2, list.get(1));
				preparedStatement.setString(3, list.get(2));
				preparedStatement.setString(4, list.get(3));
				preparedStatement.setString(5, list.get(4));
				preparedStatement.setString(6, list.get(5));
				preparedStatement.setInt(7, Integer.parseInt(list.get(6)));
				preparedStatement.setString(8, list.get(7));
				n=preparedStatement.executeUpdate();
				if (n==0) {
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
}
