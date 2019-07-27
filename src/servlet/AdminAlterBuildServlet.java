package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/AdminAlterBuildServlet")
public class AdminAlterBuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminAlterBuildServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String buildno=request.getParameter("buildno");
		String buildfieldname=request.getParameter("buildfieldname");
		String buildfieldvalue=request.getParameter("buildfieldvalue");
		System.out.println(buildno+":"+buildfieldname+":"+buildfieldvalue);
		String string=null;
		int i=0;
		
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		
		if ("����¥���".equals(buildfieldname)) {
			string="buildno";
			i=sysAdmService.alterBuildService(buildno,string,buildfieldvalue);
			if(i==0) {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update success").forward(request, response);
			}
		} else if ("�������Ա���".equals(buildfieldname)) {
			string="buildadmno";
			i=sysAdmService.alterBuildService(buildno,string,buildfieldvalue);
			if(i==0) {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update success").forward(request, response);
			}
		} else if ("����¥����".equals(buildfieldname)) {
			string="dormtype";
			i=sysAdmService.alterBuildService(buildno,string,buildfieldvalue);
			if(i==0) {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update success").forward(request, response);
			}
		} else if ("ѧ������".equals(buildfieldname)) {
			string="stucount";
			i=sysAdmService.alterBuildService(buildno,string,buildfieldvalue);
			if(i==0) {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update success").forward(request, response);
			}
		} else if ("�绰����".equals(buildfieldname)) {
			string="tel";
			i=sysAdmService.alterBuildService(buildno,string,buildfieldvalue);
			if(i==0) {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Update success").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("admin/alterbuildinfo.jsp?warning=Posible input faild").forward(request, response);
		}
	}

}
