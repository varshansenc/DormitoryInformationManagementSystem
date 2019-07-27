package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;

@WebServlet("/BuildAlterARServlet")
public class BuildAlterARServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildAlterARServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		
		String recordno=request.getParameter("recordno");
		String ARfieldname=request.getParameter("ARfieldname");
		String ARfieldvalue=request.getParameter("ARfieldvalue");
		System.out.println(recordno+":"+ARfieldname+":"+ARfieldvalue);
		String string=null;
		int i=0;
		if ("记录编号".equals(ARfieldname)) {
			request.getRequestDispatcher("dormManage/alterAR.jsp?warning=The absence record number is not allowed to be modified").forward(request, response);
		} else if("学生编号".equals(ARfieldname)){
			string="stuno";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/alterAR.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/alterAR.jsp?warning=Update succeed!").forward(request, response);
			}
		}else if ("学生姓名".equals(ARfieldname)) {
			string="stuname";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if("宿舍楼编号".equals(ARfieldname)){
			string="buildno";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if("宿舍号".equals(ARfieldname)){
			string="dormno";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if ("日期".equals(ARfieldname)) {
			string="recorddate";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if ("学生电话号码".equals(ARfieldname)) {
			string="stutel";
			i=buildAdmService.alterARService(recordno,string,ARfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("dormManage/alterAR.jsp?warning=Possible input error!").forward(request,response);
		}
	}

}
