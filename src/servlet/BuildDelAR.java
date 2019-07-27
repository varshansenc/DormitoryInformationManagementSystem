package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;

@WebServlet("/BuildDelAR")
public class BuildDelAR extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildDelAR() {}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String recordno=request.getParameter("recordno");
		
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		int i=buildAdmService.deleteAR(recordno);
		
		request.setAttribute("ff", i);
		request.getRequestDispatcher("dormManage/deleteAR.jsp").forward(request, response);
	}

}
