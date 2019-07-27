package dao;

import java.util.List;

import bean.AbsenceRecord;
import bean.BuildAdm;
import bean.Stu;

public interface BuildAdmDao {

	/**
	 * ���������Ա���в�������
	 * @param buildadmno
	 * @param buildadmid
	 * @param buildadmid2
	 * @param buildadmpwd
	 * @param buildno
	 * @param buildadmname
	 * @param buildadmsex
	 * @param buildadmtel
	 * @return ����ֵΪBoolean���ͣ�true��ʾ����ɹ���false��ʾ����ʧ��
	 */
	boolean addBuildAdm(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd, String buildno,
			String buildadmname, String buildadmsex, String buildadmtel);
	/**
	 * �����������Ա��Ų����������Ա��Ϣ
	 * @param buildAdmNo	�������Ա���
	 * @return	�����������Ա����ϸ��Ϣ
	 */
	BuildAdm searchBuildAdmDao(String buildAdmNo);
	
	/**
	 * ���������ֶ����͸��ֶ��޸ĺ��ֵȥ�޸ĸ����������Ա��ŵ��������Ա��Ϣ
	 * @param buildadmno	�������Ա���	
	 * @param string3	�ֶ���	
	 * @param buildadmfieldvalue	�޸ĺ��ֵ
	 * @return �������ͣ�1��ʾ�޸ĳɹ���0��ʾ�޸�ʧ��
	 */
	int updateBuildAdmDao(String buildadmno, String string3, String buildadmfieldvalue);
	
	/**
	 * ����ѧ������Ϣ
	 * @return
	 */
	List<Stu> displayStuDao();
	List<AbsenceRecord> displayAbsenceRecordDao();
	int addARDao(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel);
	int deleteARDao(String recordno);
	int alterARDao(String recordno, String aRfieldname, String aRfieldvalue);

}
