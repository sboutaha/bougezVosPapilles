package espaceRestaurateurs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commandesEnLigne.*;

/**
 * Servlet implementation class EspaceRestaurateur
 */
public class EspaceRestaurateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Adresse_itf r;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EspaceRestaurateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
