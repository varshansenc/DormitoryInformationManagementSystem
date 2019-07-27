package serviceimpl;

import dao.BuildAdmDao;
import dao.StuDao;
import dao.SysAdmDao;
import daoimpl.BuildAdmDaoImpl;
import daoimpl.StuDaoImpl;
import daoimpl.SysAdmDaoImpl;
import service.regesteService;

public class regesteServiceImpl implements regesteService {

	
	public regesteServiceImpl() {}

	@Override
	public boolean addStuInfo(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel) {
		StuDao stuDao=new StuDaoImpl();
		boolean flag=stuDao.addStu(stuid, stupwd, stuno, stuname, buildno, dormno, stusex, stutel);
		return flag;
	}

	@Override
	public boolean addAdminInfo(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel) {
		SysAdmDao sysAdmDao=new SysAdmDaoImpl();
		boolean flag=sysAdmDao.addSysAdm(sysadmno, sysadmid, sysadmpwd, sysadmname, sysadmsex, sysadmtel);
		return flag;
	}

	@Override
	public boolean addBuildAdmInfo(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd,
			String buildno, String buildadmname, String buildadmsex, String buildadmtel) {
		BuildAdmDao buildAdmDao=new BuildAdmDaoImpl();
		boolean flag=buildAdmDao.addBuildAdm(buildadmno,buildadmid, buildadmid2, buildadmpwd,
				buildno, buildadmname, buildadmsex, buildadmtel);
		return flag;
	}

}
