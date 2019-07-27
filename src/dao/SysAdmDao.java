package dao;

import java.util.List;

import bean.Build;
import bean.SysAdm;

public interface SysAdmDao {
	
	/**
	 * ��ϵͳ����Ա���в�������
	 * @param sysadmno
	 * @param sysadmid
	 * @param sysadmpwd
	 * @param sysadmname
	 * @param sysadmsex
	 * @param sysadmtel
	 * @return ����ֵΪBoolean���ͣ�true��ʾ����ɹ���false��ʾ����ʧ��
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
