import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Organisation {
	

	private static String JDBC_URL= "jdbc:derby:Personnel;create=true";
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	
	private static final Connection conn=Organisation.SystemConnection();

	public static Connection SystemConnection() {

		Connection con = null;
		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(JDBC_URL);
			System.out.println("connected");

		} catch (SQLException e) {
			System.out.println("echec de connexion");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
	

	public static PersonnelDAO getPersonnelsDAO(){
		return new PersonnelDAO(conn);
	}
	

}
