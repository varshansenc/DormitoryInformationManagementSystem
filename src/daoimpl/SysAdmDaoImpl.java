package daoimpl;

import dao.SysAdmDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Build;
import bean.SysAdm;

public class SysAdmDaoImpl implements SysAdmDao {

	public SysAdmDaoImpl() {}
	
	service.Connection connection=new serviceimpl.ConnectionImpl();
	java.sql.Connection connection2=null;
	ResultSet resultSet=null;
	String sql=null;
	PreparedStatement preparedStatement=null;
	@Override
	public boolean addSysAdm(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel) {
		boolean flag=false;
		sql="insert into sysadm values(?,?,?,?,?,?)";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, sysadmno);
			preparedStatement.setString(2, sysadmid);
			preparedStatement.setString(3, sysadmpwd);
			preparedStatement.setString(4, sysadmname);
			preparedStatement.setInt(5, Integer.parseInt(sysadmsex));
			preparedStatement.setString(6, sysadmtel);
			flag=preparedStatement.executeUpdate()==1;
			System.out.println("≤Â»Î"+flag);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public SysAdm searchSysAdmDao(String sysadmno) {
		SysAdm sysAdm=new SysAdm();
		sql="select * from sysadm where sysadmno='"+sysadmno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				sysAdm.setSysno(resultSet.getString(1));
				sysAdm.setSysid(resultSet.getString(2));
				sysAdm.setSyspwd(resultSet.getString(3));
				sysAdm.setSysname(resultSet.getString(4));
				sysAdm.setSyssex(resultSet.getInt(5));
				sysAdm.setSystel(resultSet.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sysAdm;
	}
	@Override
	public int alterSysAdmDao(String sysadmno, String string, String sysadmfieldvalue) {
		int i=0;
		sql="update sysadm set "+string+"='"+sysadmfieldvalue+"' where sysadmno='"+sysadmno+"'";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			System.out.println(preparedStatement);
			i=preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	@Override
	public int addBuildDao(String buildno, String buildadmno, String buildtype, String stucount, String tel) {
		int i=0;
		sql="insert into build values(?,?,?,?,?)";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			preparedStatement.setString(1, buildno);
			preparedStatement.setString(2, buildadmno);
			preparedStatement.setInt(3, Integer.parseInt(buildtype));
			preparedStatement.setInt(4, Integer.parseInt(stucount));
			preparedStatement.setString(5, tel);
			i=preparedStatement.executeUpdate();
			System.out.println(preparedStatement);
			preparedStatement.close();
			connection2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public List<Build> displayBuildDao() {
		List<Build> list=new ArrayList<Build>();
		sql="select * from build";
		try {
			connection2=connection.GetConnection();
			preparedStatement=connection2.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Build build=new Build();
				build.setBuildno(resultSet.getString(1));
				build.setBuildadmno(resultSet.getString(2));
				build.setDormtype(resultSet.getInt(3));
				build.setStucount(resultSet.getInt(4));
				build.setTel(resultSet.getString(5));
				list.add(build);
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
	public int alterBuildDao(String buildno, String string, String buildfieldvalue) {
		int i=0;
		sql="update build set "+string+"='"+buildfieldvalue+"' where buildno='"+buildno+"'";
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
		return i;
	}
	@Override
	public int deleteBuildDao(String buildno) {
		int i=0;
		sql="delete from build where buildno='"+buildno+"'";
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
		return i;
	}
	@Override
	public int deleteUserDao(String type, String username) {
		int i=0;
		sql="delete from user where type='"+type+"' and id='"+username+"'";
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
		return i;
	}
	@Override
	public int alterUserPwdService(String type, String username, String pwd) {
		int i=0;
		sql="update user set pwd='"+pwd+"' where type='"+type+"' and id='"+username+"'";
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
		return i;
	}

}
