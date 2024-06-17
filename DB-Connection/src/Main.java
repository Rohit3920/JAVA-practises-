import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

//        System.out.println("Insert one data");
//        insertData();
//        System.out.println("Delete one data from database");
//        deleteData();
        System.out.println("Update one data from database");
        updateData();
        System.out.println("Read all data");
        getDate();
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

    public static void getDate(){
        try {
            Statement statement = getConnection().createStatement();
            ResultSet result = statement.executeQuery("Select * from products");
            while(result.next()){
                System.out.println(result.getString("id") +
                        " " + result.getString("name") + " "+
                        " " + result.getString("country"));
            }
        }catch (Exception e){
            System.out.println("Error : " + e);
        }
    }

    public static void insertData(){
        try{
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("insert into products(id, name, country) values(2,'ROHIT','INDIA')");
             if(result == 1) {
                System.out.println("Inserted data successfully");
            }else {
                  System.out.println("insert data failed");
            }
        }catch(Exception err){
            System.out.println("Error : " + err);
        }
    }

    public static void deleteData(){
        try{
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("delete from products where id=1");

            if(result == 1) {
                System.out.println("Deleted data successfully");
            }else{
                System.out.println("Delete data failed");
            }
        }catch(Exception err){
            System.out.println("Error : " + err);
        }
    }

    public static void updateData(){
       try {
           Statement statement = getConnection().createStatement();
           int result = statement.executeUpdate("update products set id =1 where name='ROHIT'");
           if(result == 1) {
               System.out.println("Updated data successfully");
           }else{
               System.out.println("Update data failed");
           }
       }catch(Exception err){
           System.out.println("Error : " + err);
       }
    }
}