import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class PersonnelTestBD {
	
	
	Connection con;
	
	
	 public void setup() {
			
			Personnel p1= new Personnel.Builder("Akrami", "Payam", 1).build();
			Personnel p2= new Personnel.Builder("Akrm", "Pym", 2).build();
			Personnel p3= new Personnel.Builder("Ak", "Pm", 3).build();
			
			PersonnelDAO persoD = new PersonnelDAO(con);
			
			persoD.add(p1);
			persoD.getAll();
			
		}

}
