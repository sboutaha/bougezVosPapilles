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
	
	@EJB
	CreationRestaurant ejbCreation;
       
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String op = request.getParameter("op");
		
		if (op.equals("nouveauRestaurant")) {
			// récupérer les informations générales du restaurant
			String nomResto = request.getParameter("nomResto");
			String tel = request.getParameter("telephone");
			String voie = request.getParameter("voie");
			String ville = request.getParameter("ville");
			int nbPlaces = Integer.parseInt(request.getParameter("nbPlaces"));
			// récupérer les informations du gérant et l'enregistrer
			String idG = request.getParameter("ident");
			String mdpG = request.getParameter("mdp");
			String mailG = request.getParameter("email");
			// associer le gérant au restaurant
			// lancer la chaine de création d'un nouveau restaurant 
			// 1. Stock
			request.getRequestDispatcher("stockRestaurant.jsp").forward(request, response);
		}
		
		if (op.equals("connexion")) {
			// demander l'authentification d'un gérant du restaurant
			request.getRequestDispatcher("menuGerant.html").forward(request, response);
		}
	}

}
