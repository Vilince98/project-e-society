package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComplaintDao;
import model.Complaint;

/**
 * Servlet implementation class ComplaintController
 */
@WebServlet("/ComplaintController")
public class ComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("complaintRegister"))
		{
			Complaint c = new  Complaint();
			int mid = Integer.parseInt(request.getParameter("mid"));
			System.out.println(mid);
			c.setMid(Integer.parseInt(request.getParameter("mid")));
			c.setH_no(Integer.parseInt(request.getParameter("h_no")));
			c.setSubject(request.getParameter("subject"));
			c.setCdate(request.getParameter("cdate"));
			c.setDescription(request.getParameter("description"));
			c.setComplaint_status("applied");
			ComplaintDao.registerComplaint(c);
			request.setAttribute("msg", "Your complaint has been registered !!");
			request.getRequestDispatcher("member-register-complain.jsp").forward(request, response);
		}
	}

}
