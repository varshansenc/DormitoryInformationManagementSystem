package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.SysAdm;
import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/SysAdmSearchServlet")
public class SysAdmSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SysAdmSearchServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("1");
		String sysadmno=request.getParameter("sysadmno");
		
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		
		SysAdm sysadm=new SysAdm();
		sysadm=sysAdmService.searchSysAdmService(sysadmno);
		request.setAttribute("ff", sysadm);
		request.getRequestDispatcher("admin/sysadmInfo.jsp").forward(request, response);
	}

}
