package service;

import java.sql.ResultSet;
import java.util.List;

import bean.Stu;

public interface StuService {

	/**
	 * 根据学生编号查找学生信息
	 * @param stuno 学生编号
	 * @return 返回该学生
	 */
	Stu searchStuService(String stuno);

	/**
	 * 根据提供的字段名和该字段修改后的值去修改给定学生编号学生的信息
	 * @param stuno	学生编号
	 * @param string3	要修改的字段名
	 * @param stufieldvalue	该字段修改后的值
	 * @return 返回整型数值，1表示修改成功，0表示修改失败
	 */
	int updateStuService(String stuno, String string3, String stufieldvalue);

	ResultSet searchStuRecord(String stuno);

	int toDb(List<List<String>> stus);
	
}

