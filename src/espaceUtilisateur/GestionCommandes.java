package espaceUtilisateur;

import java.io.IOException;
import commandesEnLigne.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		// TODO Auto-generated method stub

		Restaurant_itf restaurant;
		Adresse_itf adr1 = new Adresse("rue des Olives", "Toulouse");
		Restaurant_itf resto1 = new Restaurant(1, "les Délices Du Miel", "0011223344", adr1, 2);
		manager.initRestaurant();
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
			manager.choisirRestaurant(Integer.parseInt(request.getParameter("idRestaurant")));
			request.getRequestDispatcher("menu.jsp").forward(request, response);
		} else if(request.getParameter("redirection").equals("commande")){
			manager.choisirRestaurant(Integer.parseInt(request.getParameter("idRestaurant")));
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
