import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonnelDAO implements DAO<Personnel>{
	
	private Connection connect;
	
	ArrayList<Personnel> PersonnelList;


	public void getAll() {
		try {
			String sql = "Select * From derby";
			PreparedStatement prepare = connect.prepareStatement(sql);
		
		
	} catch (SQLException e) {
		// TODO: handle exception
		}
	}
	
	public PersonnelDAO(Connection conn) {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Personnel getPersonel(int p) {
		return PersonnelList.get(p);
	}

	public void add(Personnel obj) {
		
		try {
			String sql = "INSERT INTO derby (Nom, Prenom, ID) VALUES (?,?,?) ";
			PreparedStatement prepare = connect.prepareStatement(sql);
			prepare.setString(1, obj.getNom());
			prepare.setString(2, obj.getPrenom());
			prepare.setInt(3, obj.getID());
		
	} catch (SQLException e) {
		// TODO: handle exception
	}
		
	}
		
	

	public void delete(Personnel t) {
		PersonnelList.remove(t);
		
	}

	public void update(Personnel p) {
		PersonnelList.set(PersonnelList.indexOf(p), p);
	}

	public void create() {
		Statement s=null;
		try {
			s = connect.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
	        s.execute("create table derby(Nom varchar(40), Prenom varchar(40),Id int)");
	        System.out.println("Created table location");
		} catch (Exception e) {
			// TODO: handle exception
		}
	 
		
	}
	
}