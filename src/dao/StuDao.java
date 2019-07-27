package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.Stu;

public interface StuDao {
	/**
	 * ��ѧ�����в�������
	 * @param stuid
	 * @param stupwd
	 * @param stuno
	 * @param stuname
	 * @param buildno
	 * @param dormno
	 * @param stusex
	 * @param stutel
	 * @return ����ֵΪBoolean���ͣ�true��ʾ����ɹ���false��ʾ����ʧ��
	 */
	boolean addStu(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel);

	/**
	 * ����ѧ����Ų���ѧ����Ϣ
	 * @param stuno	ѧ�����
	 * @return	���ز��ҵ���ѧ����Ϣ
	 */
	Stu searchStuDao(String stuno);

	/**
	 * ����Ҫ�޸ĵ��ֶ����͸��ֶ��޸ĺ��ֵ�޸ĸ���ѧ�����ѧ������Ϣ
	 * @param stuno	ѧ�����
	 * @param string3	Ҫ�޸ĵ��ֶ���
	 * @param stufieldvalue	�޸ĺ��ֵ
	 * @return	����ֵΪ���ͣ�1��ʾ�޸ĳɹ���0��ʾ�޸�ʧ��
	 */
	int updateStuDao(String stuno, String string3, String stufieldvalue);

	/**
	 * ����ѧ����Ų���ȱ�ڼ�¼
	 * @param stuno	ѧ�����
	 * @return ����ȱ�ڼ�¼��
	 */
	ResultSet searchStuRecordDao(String stuno);

	int insertStu(List<List<String>> stus);
}
