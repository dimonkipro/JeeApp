package tn.essat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Groupe;


public class Principale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Principale() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		IGestion dao = new GestionImp();
		List<Groupe> grps = dao.getAllGroupes();
		
		// envoyer des donnees a jsp file ( charger avec des donnes il faut a linterieur( avec variable request "dispatcher") 
		//si n'est ps chargee (avec variable response"Redirect")
		
		request.setAttribute("grps", grps);
		request.getRequestDispatcher("groupes.jsp").forward(request, response);
		
		
		
		
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
