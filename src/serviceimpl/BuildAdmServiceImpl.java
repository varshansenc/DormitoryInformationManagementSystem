package serviceimpl;

import java.util.List;

import bean.AbsenceRecord;
import bean.BuildAdm;
import bean.Stu;
import dao.BuildAdmDao;
import daoimpl.BuildAdmDaoImpl;
import service.BuildAdmService;

public class BuildAdmServiceImpl implements BuildAdmService {
	
	/**
	 * 根据宿舍管理员编号查找个人信息
	 * @param buildAdmNo 宿舍管理员编号
	 * @return	返回值一个宿舍管理员的详细信息
	 */
	BuildAdmDao buildAdmDao=new BuildAdmDaoImpl();
	public BuildAdm searchBuildAdmService(String buildAdmNo) {
		return buildAdmDao.searchBuildAdmDao(buildAdmNo);
	}

	@Override
	public int updateBuildAdmService(String buildadmno, String string3, String buildadmfieldvalue) {
		return buildAdmDao.updateBuildAdmDao(buildadmno,string3,buildadmfieldvalue);
	}
	
	@Override
	public List<Stu> displayStus() {
		return buildAdmDao.displayStuDao();
	}

	@Override
	public List<AbsenceRecord> displayAbsenceRecord() {
		return buildAdmDao.displayAbsenceRecordDao();
	}

	@Override
	public int addAR(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel) {
		return buildAdmDao.addARDao(recordno,stuno,stuname,buildno,dormno,recorddate,stutel);
	}

	@Override
	public int deleteAR(String recordno) {
		return buildAdmDao.deleteARDao(recordno);
	}

	@Override
	public int alterARService(String recordno, String aRfieldname, String aRfieldvalue) {
		return buildAdmDao.alterARDao(recordno,aRfieldname,aRfieldvalue);
	}
	
}
