package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/AdminAlterServlet")
public class AdminAlterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminAlterServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String sysadmno=request.getParameter("sysadmno");
		String sysadmfieldname=request.getParameter("sysadmfieldname");
		String sysadmfieldvalue=request.getParameter("sysadmfieldvalue");
		System.out.println(sysadmno+":"+sysadmfieldname+":"+sysadmfieldvalue);
		String string=null;
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		int i=0;
		
		if ("系统管理员编号".equals(sysadmfieldname)) {
			string="sysadmno";
			request.getRequestDispatcher("admin/altersysadm.jsp?warning=The system administrator number is not allowed to change").forward(request, response);
		}else if ("账号".equals(sysadmfieldname)) {
			string="sysadmid";
			i=sysAdmService.alterSysAdmService(sysadmno,string,sysadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update success").forward(request, response);
			}
		}else if ("密码".equals(sysadmfieldname)) {
			string="sysadmpwd";
			i=sysAdmService.alterSysAdmService(sysadmno,string,sysadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update success").forward(request, response);
			}
		}else if ("姓名".equals(sysadmfieldname)) {
			string="sysadmname";
			i=sysAdmService.alterSysAdmService(sysadmno,string,sysadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update success").forward(request, response);
			}
		}else if ("性别".equals(sysadmfieldname)) {
			request.getRequestDispatcher("admin/altersysadm.jsp?warning=Gender modification is not allowed").forward(request, response);
		}else if("电话号码".equals(sysadmfieldname)) {
			string="sysadmtel";
			i=sysAdmService.alterSysAdmService(sysadmno,string,sysadmfieldvalue);
			if (i==0) {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update faild").forward(request, response);
			}else {
				request.getRequestDispatcher("admin/altersysadm.jsp?warning=Update success").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("admin/altersysadm.jsp?warning=Posible input faild").forward(request, response);
		}
		
		
		
	}

}
