package tema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddEnrollment {

    public static void main(String[]args){
        Connection conn = null;
        String aux=null;
        String auxMaterie=null;
         String aux1=null;
         String aux2=null;
        String aux3=null;
        //List<List<Student>> enrollment = new ArrayList<List<Student>>(500);
        List<Student> enrollment=new ArrayList<>();
        int id = 102;
        int idCourse=2;
        String firstname="Raul";
       // String aux,aux1,aux2,aux3;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/tuhut";
            conn = DriverManager.getConnection(url, "root", "admin");
            System.out.println("Successfully connected to the database");

            //perform select
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select birthdate, adress, firstname, lastname from Student where firstname = '" +firstname + "'");
         //  ResultSet rsCourse=stmt.executeQuery("select name from Course where id= '" + id + "'");
           // stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname,materie, adress,birthdate) VALUES ('"+id+"','"+nica+"','akira','mate','123','1233')");
      while(rs.next()) {

             aux=rs.getString("birthdate");
            aux1=rs.getString("adress");
             aux2=rs.getString("firstname");
             aux3=rs.getString("lastname");
         //  int i=stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname,materie, adress,birthdate) VALUES (199,'"+aux3+"','"+aux2+"','istorie','"+aux+"','"+aux1+"')");
        }
            ResultSet rsCourse=stmt.executeQuery("select name from Course where id= '" + idCourse + "'");
            while(rsCourse.next()) {

                auxMaterie=rsCourse.getString("name");

                //  int i=stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname,materie, adress,birthdate) VALUES (199,'"+aux3+"','"+aux2+"','istorie','"+aux+"','"+aux1+"')");
            }
        int i=stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname,materie, adress,birthdate) VALUES ('"+id+"','"+aux3+"','"+aux2+"','"+auxMaterie+"','"+aux+"','"+aux1+"')");
           // ResultSet rsCourse=stmt.executeQuery("select name from Course where id= '" + id + "'");
       //  System.out.println(aux);
        //   int i=stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname,materie, adress,birthdate) VALUES (id,'"+rs.getString("lastname")+"','"+rs.getString("firstname")+"','"+rsCourse.getString("name")+"','"+rs.getString("adress")+"','"+rs.getString("birthdate")+"')");
     //  int i=  stmt.executeUpdate("INSERT INTO enrollment (id, lastname, firstname, materie, adress,birthdate ) VALUES (111,'"+rs.getString("lastname")+"','ana','maria','asd','brus')");
         //   System.out.println("Rows affected: " );


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
