package service;

public interface regesteService {
	/**
	 * 向学生表中添加数据
	 * @param stuid
	 * @param stupwd
	 * @param stuno
	 * @param stuname
	 * @param buildno
	 * @param dormno
	 * @param stusex
	 * @param stutel
	 * @return 返回Boolean类型值，true表示添加成功，false表示添加失败
	 */
	boolean addStuInfo(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel);

	/**
	 * 向系统管理员表中添加数据
	 * @param sysadmno
	 * @param sysadmid
	 * @param sysadmpwd
	 * @param sysadmname
	 * @param sysadmsex
	 * @param sysadmtel
	 * @return 返回Boolean类型值，true表示添加成功，false表示插入失败
	 */
	boolean addAdminInfo(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel);
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
	 * @return 返回boolean类型值，true表示添加成功，false表示添加失败
	 */

	boolean addBuildAdmInfo(String buildadmno, String buildadmid, String buildadmid2, String buildadmpwd,
			String buildno, String buildadmname, String buildadmsex, String buildadmtel);
}
