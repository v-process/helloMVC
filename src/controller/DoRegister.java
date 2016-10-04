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
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//아이디, 비밀번호, 이름, 성별(m or f), 이메일
		String id = request.getParameter("registerId");
		String pw = request.getParameter("registerPw");
		String name = request.getParameter("registerName");
		String gender = request.getParameter("gender");
		String email = request.getParameter("registerEmail");
		
		
		String page = null;
		//맞을 경우 success화면 틀릴경우 error페이지 출력
		if (id.equals("") || pw.equals("")){
			page = "/view/error.jsp";
		}
		else{
			//customer객체에 request 받은 param 값 저장.
			CustomerService customerservice = (CustomerService) CustomerService.getInstance(); 
			Customer customer = new Customer(id, pw, name, gender, email);
			customerservice.addCustomer(customer);
			
			request.setAttribute("customer", customer);
			
			page = "/view/registerSuccess.jsp";
		}
		

		RequestDispatcher rdp = request.getRequestDispatcher(page);
		rdp.forward(request, response);
		
		
	}

}
