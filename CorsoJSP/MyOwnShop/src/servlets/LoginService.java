package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/login")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username, password;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		HttpSession session = request.getSession();
		
		if (username.equals("Anna") && password.equals("12345")){
			
			session.putValue("isLogged", "true");
			
			//CREA PAGINA PRODOTTI
			response.sendRedirect("loginRiuscito.jsp");
			
		} else {
			
			session.putValue("isLogged", "false");
			
			//CREA PAGINA DI ERRORE
			response.sendRedirect("errorLogin.jsp");
			
		}
		
	}

}
