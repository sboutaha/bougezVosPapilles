package espaceUtilisateur;

import java.io.IOException;
import commandesEnLigne.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import java.util.Hashtable;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
import javax.ejb.*;

/**
 * Servlet implementation class GestionCommandes
 */
public class GestionCommandes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionCommandes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @EJB GestionCommandesManagerItf manager;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Restaurant_itf restaurant;
		Restaurant_itf resto1 = new Restaurant();
		manager.addRestaurant(resto1);
	if(request.getParameter("page").equals("index")){
		if(request.getParameter("redirection").equals("connexion")){
			request.getRequestDispatcher("connexion.jsp").forward(request, response);
		}else{ 
			if(request.getParameter("redirection").equals("inscription")){
				request.getRequestDispatcher("inscription.jsp").forward(request, response);
			} else{
				if(request.getParameter("redirection").equals("listeDesRestaurants")){
					request.setAttribute("listeRestaurants", manager.getListeRestaurants());
					request.getRequestDispatcher("listeDesRestaurants.jsp").forward(request, response);
				}
			}
		}
	} else if (request.getParameter("page").equals("listeDesRestaurants")){
		if(request.getParameter("redirection").equals("menu")){
			restaurant=manager.getRestaurant(request.getParameter("nomRestaurant"));
			request.getRequestDispatcher("menu.jsp").forward(request, response);
		} else if(request.getParameter("redirection").equals("commande")){
			restaurant=manager.getRestaurant(request.getParameter("nomRestaurant"));
			request.getRequestDispatcher("commande.jsp").forward(request, response);
		}
	} else if (request.getParameter("page").equals("menu")){
		
		
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
