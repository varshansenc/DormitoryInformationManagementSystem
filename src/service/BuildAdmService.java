package service;

import java.util.List;

import bean.AbsenceRecord;
import bean.Stu;

public interface BuildAdmService {

	/**
	 * 根据给定字段的值修改给定宿舍管理员的信息
	 * @param buildadmno	宿舍管理员编号
	 * @param string3		给定字段	
	 * @param buildadmfieldvalue	修改后的值
	 * @return	返回整型，1表示修改成功，0表示修改失败
	 */
	int updateBuildAdmService(String buildadmno, String string3, String buildadmfieldvalue);

	List<Stu> displayStus();

	List<AbsenceRecord> displayAbsenceRecord();

	int addAR(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel);

	int deleteAR(String recordno);

	int alterARService(String recordno, String aRfieldname, String aRfieldvalue);

}
