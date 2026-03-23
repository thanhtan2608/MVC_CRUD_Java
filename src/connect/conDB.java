package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class conDB {
    public static Connection getConnection(){

        try{
            String url = "jdbc:mysql://localhost:3306/demo1";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url,user,password);

            return conn;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
