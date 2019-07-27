package service;

import java.util.List;

import bean.AbsenceRecord;
import bean.Stu;

public interface BuildAdmService {

	/**
	 * ���ݸ����ֶε�ֵ�޸ĸ����������Ա����Ϣ
	 * @param buildadmno	�������Ա���
	 * @param string3		�����ֶ�	
	 * @param buildadmfieldvalue	�޸ĺ��ֵ
	 * @return	�������ͣ�1��ʾ�޸ĳɹ���0��ʾ�޸�ʧ��
	 */
	int updateBuildAdmService(String buildadmno, String string3, String buildadmfieldvalue);

	List<Stu> displayStus();

	List<AbsenceRecord> displayAbsenceRecord();

	int addAR(String recordno, String stuno, String stuname, String buildno, String dormno, String recorddate,
			String stutel);

	int deleteAR(String recordno);

	int alterARService(String recordno, String aRfieldname, String aRfieldvalue);

}
