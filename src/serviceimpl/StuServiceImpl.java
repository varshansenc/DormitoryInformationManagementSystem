package serviceimpl;

import java.sql.ResultSet;
import java.util.List;

import bean.Stu;
import dao.StuDao;
import daoimpl.StuDaoImpl;
import service.StuService;

public class StuServiceImpl implements StuService {

	StuDao studao=new StuDaoImpl();
	@Override
	public Stu searchStuService(String stuno) {
		return studao.searchStuDao(stuno);
	}
	@Override
	public int updateStuService(String stuno, String string3, String stufieldvalue) {
		return studao.updateStuDao(stuno,string3,stufieldvalue);
	}
	@Override
	public ResultSet searchStuRecord(String stuno) {		
		return studao.searchStuRecordDao(stuno);
	}
	@Override
	public int toDb(List<List<String>> stus) {
		return studao.insertStu(stus);
	}
}
