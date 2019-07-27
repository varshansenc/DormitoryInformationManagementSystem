package dao;

import java.util.List;

import bean.Build;
import bean.SysAdm;

public interface SysAdmDao {
	
	/**
	 * 向系统管理员表中插入数据
	 * @param sysadmno
	 * @param sysadmid
	 * @param sysadmpwd
	 * @param sysadmname
	 * @param sysadmsex
	 * @param sysadmtel
	 * @return 返回值为Boolean类型，true表示插入成功，false表示插入失败
	 */
	boolean addSysAdm(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel);

	SysAdm searchSysAdmDao(String sysadmno);

	int alterSysAdmDao(String sysadmno, String string, String sysadmfieldvalue);

	int addBuildDao(String buildno, String buildadmno, String buildtype, String stucount, String tel);

	List<Build> displayBuildDao();

	int alterBuildDao(String buildno, String string, String buildfieldvalue);

	int deleteBuildDao(String buildno);

	int deleteUserDao(String type, String username);

	int alterUserPwdService(String type, String username, String pwd);
}
