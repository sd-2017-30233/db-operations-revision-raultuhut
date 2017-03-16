package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadStudent {

	public static void main(String[]args){
		Connection conn = null;
		List<Student> students = new ArrayList<>();
		String firstname = "Raul";
		try
	    {
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      String url = "jdbc:mysql://localhost/tuhut";
	      conn = DriverManager.getConnection(url, "root", "admin");
	      System.out.println("Successfully connected to the database");
	      
	      //perform select 
	      Statement stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery("select birthdate, adress, firstname, lastname from Student where firstname = '" + firstname + "'");
	      while (rs.next()){
	    	  Student p = new Student();
	    	  p.setDataNasterii(rs.getString("birthdate"));
			  p.setAdresa(rs.getString("adress"));
	    	  p.setPrenume(rs.getString("firstname"));
	    	  p.setNume(rs.getString("lastname"));
	    	  System.out.println(p);
	    	  students.add(p);
	      }
	      System.out.println("Persoane : " + students.size());
	    }
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if (conn != null) {
				try {
					if (!conn.isClosed()){
						conn.close();
					}
				} catch (SQLException e) {
				}
			}
		}

	}
}
