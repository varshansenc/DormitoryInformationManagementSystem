package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/AdminAddBuildServlet")
public class AdminAddBuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminAddBuildServlet() {}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String buildno=request.getParameter("buildno");
		String buildadmno=request.getParameter("buildadmno");
		String buildtype=request.getParameter("buildtype");
		String stucount=request.getParameter("stucount");
		String tel=request.getParameter("tel");
		
		System.out.println(buildno+":"+buildadmno+":"+buildtype+":"+stucount+":"+tel);
		
		SysAdmService sysAdmService=new SysAdmServiceImpl();
	
		int i=sysAdmService.addBuildService(buildno,buildadmno,buildtype,stucount,tel);
		request.setAttribute("ff", i);
		request.getRequestDispatcher("admin/addBuildInfo.jsp").forward(request, response);
	}

}
