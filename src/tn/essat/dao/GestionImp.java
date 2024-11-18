package tn.essat.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tn.essat.model.Etudiant;
import tn.essat.model.Groupe;

public class GestionImp implements IGestion {
	Connection cnx;

	public GestionImp() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/appJee","root","");
		}catch (Exception e){
		}
	}

	@Override
	public List<Groupe> getAllGroupes() {
		
		List<Groupe> groupe = new ArrayList<Groupe>();
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from groupe");
				ResultSet rs = pre.executeQuery();
				while(rs.next()) {
					Groupe gr = new Groupe(rs.getInt("id"), rs.getString("titre"));
					groupe.add(gr);
				}
		}catch (Exception e) {
					
				}
				return groupe;
	}

	
	
	@Override
	public List<Etudiant> getAllEtudiantsByGrp(int id_grp) {
		
		
		List<Etudiant> etudiant = new ArrayList<Etudiant>();
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from etudiant where gpe_id =?");
			pre.setInt(1, id_grp);
			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				Etudiant etd = new Etudiant(rs.getInt("id"), rs.getString("nom"), this.getGroupeById(rs.getInt("gpe_id")));
				etudiant.add(etd);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return etudiant;
	}
	
	
	public Groupe getGroupeById(int id) {
		Groupe g = null;
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from groupe where id=?");
			pre.setInt(1, id);
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				g = new Groupe(rs.getInt("id"), rs.getString("titre"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return g;
	}

	
	
	@Override
	public void addEtudiant(Etudiant etd) {
		
		// TODO Auto-generated method stub
		try {
			PreparedStatement pre = this.cnx.prepareStatement("insert into etudiant values(null,?,?)");
			pre.setString(1, etd.getNom());
			pre.setInt(2, etd.getGpe().getId());
			
			pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
	@Override
	public void deleteEtudiant(int id_etd) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pre = this.cnx.prepareStatement("delete from etudiant where id=?");
			pre.setInt(1, id_etd);
			
			pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}
