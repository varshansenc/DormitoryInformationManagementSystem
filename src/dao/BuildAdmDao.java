package dao;

import java.util.List;

import bean.AbsenceRecord;
import bean.BuildAdm;
import bean.Stu;

public interface BuildAdmDao {

	/**
	 * 向宿舍管理员表中插入数据
	 * @param buildadmno
	 * @param buildadmid
	 * @param buildadmid2
	 * @param buildadmpwd
	 * @param buildno
	 * @param buildadmname
	 * @param buildadmsex
	 * @param buildadmtel
	 * @return 返回值为Boolean类型，true表示插入成功，false表示插入失败
	 */
	boolean addBuildAdm(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd, String buildno,
			String buildadmname, String buildadmsex, String buildadmtel);
	/**
	 * 根据宿舍管理员编号查找宿舍管理员信息
	 * @param buildAdmNo	宿舍管理员编号
	 * @return	返回宿舍管理员的详细信息
	 */
	BuildAdm searchBuildAdmDao(String buildAdmNo);
	
	/**
	 * 根据所给字段名和该字段修改后的值去修改给定宿舍管理员编号的宿舍管理员信息
	 * @param buildadmno	宿舍管理员编号	
	 * @param string3	字段名	
	 * @param buildadmfieldvalue	修改后的值
	 * @return 返回整型，1表示修改成功，0表示修改失败
	 */
	int updateBuildAdmDao(String buildadmno, String string3, String buildadmfieldvalue);
	
	/**
	 * 查找学生表信息
	 * @return
	 */
	List<Stu> displayStuDao();
	List<AbsenceRecord> displayAbsenceRecordDao();
	int addARDao(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel);
	int deleteARDao(String recordno);
	int alterARDao(String recordno, String aRfieldname, String aRfieldvalue);

}
