package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.regesteService;
import serviceimpl.regesteServiceImpl;

/**
 * Servlet implementation class regesteServlet
 */
@WebServlet("/regesteServlet")
public class regesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	regesteService regesteService=new regesteServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regesteServlet() {
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	String type=req.getParameter("type");
    	System.out.println(type);
    	if ("sysadm".equals(type)) {
    		String sysadmno=req.getParameter("sysadmno");
    		String sysadmid=req.getParameter("sysadmid");
    		String sysadmpwd=req.getParameter("sysadmpwd");
    		String sysadmname=req.getParameter("sysadmname");
    		String sysadmsex=req.getParameter("sysadmsex");
    		String sysadmtel=req.getParameter("sysadmtel");
    		System.out.println(sysadmno+":"+sysadmid+":"+sysadmpwd+":"+sysadmname+":"+sysadmsex+":"+sysadmtel);
    		boolean flag=addAdmin(sysadmno,sysadmid,sysadmpwd,sysadmname,sysadmsex,sysadmtel);
    		System.out.println(flag);
    		if (flag) {
				resp.sendRedirect("/w/index.jsp");
			}else {
				resp.sendRedirect("admin/regesteAdmin.jsp?warning=Registration failed! Please register again!");
				//req.getRequestDispatcher("/admin/regesteAdmin.jsp?warning=Registration failed! Please register again!").forward(req, resp);
			}
		} else if ("buildadm".equals(type)) {
			String buildadmno=req.getParameter("buildadmno");
			String buildadmid=req.getParameter("buildadmid");
			String buildadmpwd=req.getParameter("buildadmpwd");
			String buildno=req.getParameter("buildno");
			String buildadmname=req.getParameter("buildadmname");
			String buildadmsex=req.getParameter("buildadmsex");
			String buildadmtel=req.getParameter("buildadmtel");
			System.out.println(buildadmno+":"+buildadmid+":"+buildadmpwd+":"+buildno+":"+buildadmname+":"+buildadmsex+":"+buildadmtel);
			boolean flag=addBuildAdm(buildadmno,buildadmid,buildadmpwd,buildno,buildadmname,buildadmsex,buildadmtel);
			System.out.println(flag);
			if (flag) {
				resp.sendRedirect("/w/index.jsp");
			}else {
				req.getRequestDispatcher("dormManage/regesteManage.jsp?warning=Registration failed! Please register again!").forward(req, resp);
				//resp.sendRedirect("/w/dormManage/regesteManage.jsp?warning=Registration failed! Please register again!");
			}
		}else if ("stu".equals(type)) {
			String stuid=req.getParameter("stuid");
			String stupwd=req.getParameter("stupwd");
			String stuno=req.getParameter("stuno");
			String stuname=req.getParameter("stuname");
			String buildno=req.getParameter("buildno");
			String dormno=req.getParameter("dormno");
			String stusex=req.getParameter("stusex");
			String stutel=req.getParameter("stutel");
			System.out.println(stuid+":"+stupwd+":"+stuno+":"+stuname+":"+buildno+":"+dormno+":"+stusex+":"+stutel);
			boolean flag=addStu(stuid,stupwd,stuno,stuname,buildno,dormno,stusex,stutel);
			System.out.println(flag);
			
			if (flag) {
				resp.sendRedirect("/w/index.jsp");
			}else {
				req.getRequestDispatcher("student/regesteStudent.jsp?warning=Registration failed! Please register again!").forward(req, resp);
				//resp.sendRedirect("/w/student/regesteStudent.jsp?warning=Registration failed! Please register again!");
			}
		}else {
			resp.sendRedirect("/w/index.jsp");
		}
    }

	private boolean addBuildAdm(String buildadmno, String buildadmid, String buildadmpwd, String buildno,
			String buildadmname, String buildadmsex, String buildadmtel) {
		boolean flag=regesteService.addBuildAdmInfo(buildadmno,buildadmid,buildadmid,buildadmpwd,buildno,buildadmname,buildadmsex,buildadmtel);
		return flag;
	}

	private boolean addAdmin(String sysadmno, String sysadmid, String sysadmpwd, String sysadmname, String sysadmsex,
			String sysadmtel) {
		boolean flag=regesteService.addAdminInfo(sysadmno,sysadmid,sysadmpwd,sysadmname,sysadmsex,sysadmtel);
		return flag;
	}

	private boolean addStu(String stuid, String stupwd, String stuno, String stuname, String buildno, String dormno,
			String stusex, String stutel) {
		boolean flag=regesteService.addStuInfo(stuid, stupwd, stuno, stuname, buildno, dormno, stusex, stutel);
		return flag;
	}
}
