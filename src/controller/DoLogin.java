package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomerService;
import model.Customer;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		//db에 있는 아이디 값과 맞는지 비교		
		CustomerService customerservice = (CustomerService) CustomerService.getInstance();
	
		//Customer customer = customerservice.findCustomer(userId);
		Customer customer = customerservice.loginCustomer(userId, userPw);
		
		//맞을 경우 success화면 틀릴경우 error페이지 출력 
		String page = null;
				
		//로그인 실패시.
		if (customer == null){
			page = "/view/loginFail.jsp";
			request.setAttribute("userId", userId);
		}
		//로그인 성공시.
		else{
			page = "/view/loginSuccess.jsp";
			request.setAttribute("customer", customer);
		}

		
		RequestDispatcher rdp = request.getRequestDispatcher(page);
		rdp.forward(request, response);
		

	}

}
