package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.Stu;

public interface StuDao {
	/**
	 * 向学生表中插入数据
	 * @param stuid
	 * @param stupwd
	 * @param stuno
	 * @param stuname
	 * @param buildno
	 * @param dormno
	 * @param stusex
	 * @param stutel
	 * @return 返回值为Boolean类型，true表示插入成功，false表示插入失败
	 */
	boolean addStu(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel);

	/**
	 * 根据学生编号查找学生信息
	 * @param stuno	学生编号
	 * @return	返回查找到的学生信息
	 */
	Stu searchStuDao(String stuno);

	/**
	 * 根据要修改的字段名和该字段修改后的值修改给定学生编号学生的信息
	 * @param stuno	学生编号
	 * @param string3	要修改的字段名
	 * @param stufieldvalue	修改后的值
	 * @return	返回值为整型，1表示修改成功，0表示修改失败
	 */
	int updateStuDao(String stuno, String string3, String stufieldvalue);

	/**
	 * 根据学生编号查找缺勤记录
	 * @param stuno	学生编号
	 * @return 返回缺勤记录表
	 */
	ResultSet searchStuRecordDao(String stuno);

	int insertStu(List<List<String>> stus);
}
