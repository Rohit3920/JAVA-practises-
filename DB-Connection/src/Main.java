import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        getConnection();
    }

    public static Connection getConnection() {
        try{
            String driver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost/e-comm";
            String userNm = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbURL, userNm, password);
            System.out.println("Database connected successfully");
            return conn;
        }catch (Exception err){
            System.out.println("Connection error : " + err);
        }
        return null;
    }
}