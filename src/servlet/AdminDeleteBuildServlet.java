package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;
@WebServlet("/AdminDeleteBuildServlet")
public class AdminDeleteBuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminDeleteBuildServlet() {}
    /*
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		
		String buildno=request.getParameter("buildno");
		
		System.out.println(buildno+":");
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		
		int i=sysAdmService.deleteBuildService(buildno);
		request.setAttribute("ff", i);
		request.getRequestDispatcher("dormManage/deleteAR.jsp").forward(request,response);
	}

}
