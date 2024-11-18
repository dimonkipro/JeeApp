package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.model.Etudiant;
import tn.essat.model.Groupe;

public class PostAjouter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PostAjouter() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		int id = Integer.parseInt(request.getParameter("idgrp"));

		GestionImp dao = new GestionImp();
		Groupe gr = dao.getGroupeById(id);
		Etudiant etd = new Etudiant(0, nom, gr);
		dao.addEtudiant(etd);
		request.getRequestDispatcher("PreEtds?id=" + id).forward(request, response);

	}

}
