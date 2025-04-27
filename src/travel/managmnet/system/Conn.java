package travel.managmnet.system;
import java.sql.*;


public class Conn {

    Connection c;
    Statement s;
    public Conn() {
       
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/TravelManagmentSystem";
            String username = "postgres";
            String password = "Nithish@18";
            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        
        }
        
    }

   }
