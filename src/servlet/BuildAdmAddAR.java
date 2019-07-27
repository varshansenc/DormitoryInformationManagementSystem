package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;
@WebServlet("/BuildAdmAddAR")
public class BuildAdmAddAR extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildAdmAddAR() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String recordno=request.getParameter("recordno");
		String stuno=request.getParameter("stuno");
		String stuname=request.getParameter("stuname");
		String buildno=request.getParameter("buildno");
		String dormno=request.getParameter("dormno");
		String recorddate=request.getParameter("recorddate");
		String stutel=request.getParameter("stutel");
	
		
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		int i=buildAdmService.addAR(recordno,stuno,stuname,buildno,dormno,recorddate,stutel);
		request.setAttribute("ff", i);
		request.getRequestDispatcher("dormManage/addAbsenceRecord.jsp").forward(request, response);
	}

}
