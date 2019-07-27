package service;

import java.sql.ResultSet;
import java.util.List;

import bean.Stu;

public interface StuService {

	/**
	 * ����ѧ����Ų���ѧ����Ϣ
	 * @param stuno ѧ�����
	 * @return ���ظ�ѧ��
	 */
	Stu searchStuService(String stuno);

	/**
	 * �����ṩ���ֶ����͸��ֶ��޸ĺ��ֵȥ�޸ĸ���ѧ�����ѧ������Ϣ
	 * @param stuno	ѧ�����
	 * @param string3	Ҫ�޸ĵ��ֶ���
	 * @param stufieldvalue	���ֶ��޸ĺ��ֵ
	 * @return ����������ֵ��1��ʾ�޸ĳɹ���0��ʾ�޸�ʧ��
	 */
	int updateStuService(String stuno, String string3, String stufieldvalue);

	ResultSet searchStuRecord(String stuno);

	int toDb(List<List<String>> stus);
	
}

