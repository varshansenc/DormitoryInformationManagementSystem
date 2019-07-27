package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/AdminAlterUserServlet")
public class AdminAlterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminAlterUserServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String type=request.getParameter("type");
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		
		System.out.println(type+":"+username+":"+pwd);
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		
		int i=sysAdmService.alterUserService(type,username,pwd);
		request.setAttribute("ff", i);
		request.getRequestDispatcher("admin/alterUserPwd.jsp").forward(request, response);
	}

}
