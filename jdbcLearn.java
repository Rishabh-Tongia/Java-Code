import java.sql.*;
import java.util.*;

public class jdbcLearn {
    public static void main(String args[]){
        try{
            String url = "jdbc:postgresql://localhost:5432/jdbc_test";
            String username = "Rishabh";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            Class.forName("org.postgresql.Driver");

            if(con.isClosed()){
                System.out.println("Connection closed");
            }
            else{
                System.out.println("Connection Established Successfully !!!!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
