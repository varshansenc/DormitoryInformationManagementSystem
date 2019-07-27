package service;

import java.util.List;

import bean.Build;
import bean.SysAdm;

public interface SysAdmService {

	SysAdm searchSysAdmService(String sysadmno);

	int alterSysAdmService(String sysadmno, String string, String sysadmfieldvalue);

	int addBuildService(String buildno, String buildadmno, String buildtype, String stucount, String tel);

	List<Build> displayBuildService();

	int alterBuildService(String buildno, String string, String buildfieldvalue);

	int deleteBuildService(String buildno);

	int deleteUserService(String type, String username);

	int alterUserService(String type, String username, String pwd);

}
