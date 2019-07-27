package daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.AbsenceRecord;
import bean.BuildAdm;
import bean.Stu;
import dao.BuildAdmDao;

public class BuildAdmDaoImpl implements BuildAdmDao {

	service.Connection connection=new serviceimpl.ConnectionImpl();
	java.sql.Connection connection2=null;
	String sql=null;
	PreparedStatement preparedStatement=null;
	@Override
	public boolean addBuildAdm(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd,
			String buildno, String buildadmname, String buildadmsex, String buildadmtel) {
		boolean flag=false;
		sql="insert into buildadm values(?,?,?,?,?,?,?)";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, buildadmno);
			preparedStatement.setString(2, buildadmid);
			preparedStatement.setString(3, buildadmpwd);
			preparedStatement.setString(4, buildno);
			preparedStatement.setString(5, buildadmname);
			preparedStatement.setInt(6, Integer.parseInt(buildadmsex));
			preparedStatement.setString(7, buildadmsex);
			flag=preparedStatement.executeUpdate()==1;
			System.out.println("²åÈë"+flag);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	BuildAdm buildAdm=new BuildAdm();
	ResultSet resultSet=null;
	@Override
	public BuildAdm searchBuildAdmDao(String buildAdmNo) {
		sql="select * from buildadm where buildadmno='"+buildAdmNo+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			resultSet=preparedStatement.executeQuery();
			System.out.println(resultSet);
			while (resultSet.next()) {
				buildAdm.setBuildadmno(buildAdmNo);
				buildAdm.setBuildadmid(resultSet.getString(2));
				buildAdm.setBuildadmpwd(resultSet.getString(3));
				buildAdm.setBuildno(resultSet.getString(4));
				buildAdm.setBuildadmname(resultSet.getString(5));
				buildAdm.setBuildadmsex(resultSet.getInt(6));
				buildAdm.setBuildtel(resultSet.getString(7));
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buildAdm;
	}

	@Override
	public int updateBuildAdmDao(String buildadmno, String string3, String buildadmfieldvalue) {
		int i=0;
		sql="update buildadm set "+string3+"='"+buildadmfieldvalue+"' where buildadmno='"+buildadmno+"'";
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
		System.out.println(i+"grses");
		return i;
	}

	@Override
	public List<Stu> displayStuDao() {
		sql="select * from stu";
		List<Stu> list=new ArrayList<Stu>();
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Stu stu=new Stu();
				stu.setStuno(resultSet.getString(1));
				stu.setStuid(resultSet.getString(2));
				stu.setStupwd(resultSet.getString(3));
				stu.setStuname(resultSet.getString(4));
				stu.setBuildno(resultSet.getString(5));
				stu.setDormno(resultSet.getString(6));
				stu.setStusex(resultSet.getInt(7));
				stu.setStutel(resultSet.getString(8));
				list.add(stu);
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AbsenceRecord> displayAbsenceRecordDao() {
		sql="select * from absencerecord";
		List<AbsenceRecord> list=new ArrayList<AbsenceRecord>();
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				AbsenceRecord stu=new AbsenceRecord();
				stu.setRecordno(resultSet.getString(1));
				stu.setStuno(resultSet.getString(2));
				stu.setStuname(resultSet.getString(3));
				stu.setBuildno(resultSet.getString(4));
				stu.setDormno(resultSet.getString(5));
				stu.setRecorddate(resultSet.getString(6));
				stu.setStutel(resultSet.getString(7));
				list.add(stu);
			}
			resultSet.close();
			preparedStatement.close();
			connection2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addARDao(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel) {
		int i=0;
		sql="insert into absencerecord values(?,?,?,?,?,?,?)";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, recordno);
			preparedStatement.setString(2, stuno);
			preparedStatement.setString(3, stuname);
			preparedStatement.setString(4, buildno);
			preparedStatement.setString(5, dormno);
			preparedStatement.setString(6, recorddate);
			preparedStatement.setString(7, stutel);
			i=preparedStatement.executeUpdate();
			System.out.println("²åÈë"+i);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteARDao(String recordno) {
		int i=0;
		sql="delete from absencerecord where recordno='"+recordno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			i=preparedStatement.executeUpdate();
			System.out.println("É¾³ý"+i);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int alterARDao(String recordno, String aRfieldname, String aRfieldvalue) {
		int i=0;
		sql="update absencerecord set "+aRfieldname+"='"+aRfieldvalue+"' where recordno='"+recordno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			i=preparedStatement.executeUpdate();
			System.out.println("ÐÞ¸Ä"+i);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
