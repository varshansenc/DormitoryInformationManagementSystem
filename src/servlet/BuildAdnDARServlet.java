package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AbsenceRecord;
import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;

@WebServlet("/BuildAdnDARServlet")
public class BuildAdnDARServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildAdnDARServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		List<AbsenceRecord> list=buildAdmService.displayAbsenceRecord();
		request.setAttribute("ff", list);
		request.getRequestDispatcher("dormManage/displayAbsenceRecord.jsp").forward(request, response);
	}

}
