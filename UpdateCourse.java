package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCourse {

    public static void main(String[]args){
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/tuhut";
            conn = DriverManager.getConnection(url, "root", "admin");
            System.out.println("Successfully connected to the database");

            //perform select
            Statement stmt = conn.createStatement();
            int i = stmt.executeUpdate("UPDATE course SET teacher='Pop' WHERE id=2");
            System.out.println("Rows affected: " + i);
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
