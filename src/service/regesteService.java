package service;

public interface regesteService {
	/**
	 * ��ѧ�������������
	 * @param stuid
	 * @param stupwd
	 * @param stuno
	 * @param stuname
	 * @param buildno
	 * @param dormno
	 * @param stusex
	 * @param stutel
	 * @return ����Boolean����ֵ��true��ʾ��ӳɹ���false��ʾ���ʧ��
	 */
	boolean addStuInfo(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel);

	/**
	 * ��ϵͳ����Ա�����������
	 * @param sysadmno
	 * @param sysadmid
	 * @param sysadmpwd
	 * @param sysadmname
	 * @param sysadmsex
	 * @param sysadmtel
	 * @return ����Boolean����ֵ��true��ʾ��ӳɹ���false��ʾ����ʧ��
	 */
	boolean addAdminInfo(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel);
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
	 * @return ����boolean����ֵ��true��ʾ��ӳɹ���false��ʾ���ʧ��
	 */

	boolean addBuildAdmInfo(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd,
			String buildno, String buildadmname, String buildadmsex, String buildadmtel);
}
