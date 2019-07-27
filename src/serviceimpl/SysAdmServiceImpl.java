package serviceimpl;

import java.util.List;

import bean.Build;
import bean.SysAdm;
import dao.SysAdmDao;
import daoimpl.SysAdmDaoImpl;
import service.SysAdmService;

public class SysAdmServiceImpl implements SysAdmService {

	SysAdmDao sysadmDao=new SysAdmDaoImpl();
	@Override
	public SysAdm searchSysAdmService(String sysadmno) {
		return sysadmDao.searchSysAdmDao(sysadmno);
	}
	@Override
	public int alterSysAdmService(String sysadmno, String string, String sysadmfieldvalue) {
		return sysadmDao.alterSysAdmDao(sysadmno,string,sysadmfieldvalue);
	}
	@Override
	public int addBuildService(String buildno, String buildadmno, String buildtype, String stucount, String tel) {
		return sysadmDao.addBuildDao(buildno,buildadmno,buildtype,stucount,tel);
	}
	@Override
	public List<Build> displayBuildService() {
		return sysadmDao.displayBuildDao();
	}
	@Override
	public int alterBuildService(String buildno, String string, String buildfieldvalue) {
		return sysadmDao.alterBuildDao(buildno,string,buildfieldvalue);
	}
	@Override
	public int deleteBuildService(String buildno) {
		return sysadmDao.deleteBuildDao(buildno);
	}
	@Override
	public int deleteUserService(String type, String username) {
		return sysadmDao.deleteUserDao(type,username);
	}
	@Override
	public int alterUserService(String type, String username, String pwd) {
		return sysadmDao.alterUserPwdService(type,username,pwd);
	}

}
