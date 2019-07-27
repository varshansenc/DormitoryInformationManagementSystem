package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;

/**
 * Servlet implementation class BuildAdmAlterServlet
 */
@WebServlet("/BuildAdmAlterServlet")
public class BuildAdmAlterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildAdmAlterServlet() {}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String buildadmno=request.getParameter("buildadmno");
		String buildadmfieldname=request.getParameter("buildadmfieldname");
		String buildadmfieldvalue=request.getParameter("buildadmfieldvalue");
		System.out.println(buildadmno+":"+buildadmfieldname+":"+buildadmfieldvalue);
		String string3=null;
		int i=0;
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		
		if ("Àﬁ…·π‹¿Ì‘±±‡∫≈".equals(buildadmfieldname)) {
			request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Dormitory administrator ID is not allowed to be modified").forward(request, response);
		}else if("’À∫≈".equals(buildadmfieldname)) {
			request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Please contact the system administrator to change the account.").forward(request, response);
		}else if("√‹¬Î".equals(buildadmfieldname)) {
			request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Please contact your system administrator to change your password.").forward(request, response);
		}else if("Àﬁ…·¬•±‡∫≈".equals(buildadmfieldname)) {
			string3="buildno";
			i=buildAdmService.updateBuildAdmService(buildadmno,string3,buildadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if("–’√˚".equals(buildadmfieldname)) {
			string3="buildadmname";
			i=buildAdmService.updateBuildAdmService(buildadmno,string3,buildadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if("µÁª∞∫≈¬Î".equals(buildadmfieldname)) {
			string3="buildadmtel";
			i=buildAdmService.updateBuildAdmService(buildadmno,string3,buildadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Update success!").forward(request, response);
			}
		}else if ("–‘±".equals(buildadmfieldname)) {
			request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Gender cannot be changed!").forward(request, response);
		}else {
			request.getRequestDispatcher("dormManage/buildadmAlter.jsp?warning=Possible input error!").forward(request, response);
		}
		
	}

}
