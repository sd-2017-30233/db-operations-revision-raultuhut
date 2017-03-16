package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadCourse{

    public static void main(String[]args){
        Connection conn = null;
        List<Course> courses = new ArrayList<>();
        int id=1;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/tuhut";
            conn = DriverManager.getConnection(url, "root", "admin");
            System.out.println("Successfully connected to the database");

            //perform select
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id, name, teacher, year from Course where id = '" + id + "'");
            while (rs.next()){
                Course p = new Course();
                p.setNume(rs.getString("name"));
                p.setTeacher(rs.getString("teacher"));
                p.setAn(rs.getInt("year"));
                System.out.println(p);
                courses.add(p);
            }
            System.out.println("Persoane : " + courses.size());
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
