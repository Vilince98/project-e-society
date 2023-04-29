package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HallBookDao;
import model.HallBook;

/**
 * Servlet implementation class HallBookingCOntroller
 */
@WebServlet("/HallBookController")
public class HallBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HallBookController() {
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
		
		if(action.equalsIgnoreCase("bookHall")) {
			HallBook b = new HallBook();
			b.setMid(Integer.parseInt(request.getParameter("mid")));
			b.setB_subject(request.getParameter("b_subject"));
			b.setB_hour(Integer.parseInt(request.getParameter("b_hour")));
			b.setB_date(request.getParameter("b_date"));
			b.setB_time(request.getParameter("b_time"));
			HallBookDao.bookHall(b);
			System.out.println("Hall Booked!! Controller");
			response.sendRedirect("member-hall-booking-list.jsp");
		}
		if(action.equalsIgnoreCase("editBookHallDetail")) {
			HallBook b = new HallBook();
			b.setBid(Integer.parseInt(request.getParameter("bid")));
			b.setMid(Integer.parseInt(request.getParameter("mid")));
			b.setB_subject(request.getParameter("b_subject"));
			b.setB_hour(Integer.parseInt(request.getParameter("b_hour")));
			b.setB_date(request.getParameter("b_date"));
			b.setB_time(request.getParameter("b_time"));
			HallBookDao.updateBookHallDetail(b);
			response.sendRedirect("member-hall-booking-list.jsp");
		}
	}

}
