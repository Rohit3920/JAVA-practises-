
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome JDBC in MySQL!");

//        System.out.println("Insert one data");
//        insertData();
//        System.out.println("Delete one data from database");
//        deleteData();
//        System.out.println("Update one data from database");
//        updateData();
//        System.out.println("Show Data entires from database by user throught");
//        getRecordWithInput();
//        System.out.println("Read all data");
//        getDate();
        int ch;
        do {
            System.out.println("Choose the correct option");
            System.out.println("0) Exit"
                    + "\n1) show data"
                    + "\n2) insert data"
                    + "\n3) updateData data"
                    + "\n4) deleteData data"
                    + "\n5) show only one record");
            Scanner op = new Scanner(System.in);
            ch = op.nextInt();
            switch (ch) {
                case 0:
                    System.out.println("Exit");
                case 1:
                    getDate();
                    break;
                case 2:
                    insertData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    getRecordWithInput();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (ch != 0 && ch <= 5);
    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost/e-comm";
            String userNm = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbURL, userNm, password);
            return conn;
        } catch (Exception err) {
            System.out.println("Connection error : " + err);
        }
        return null;
    }

    public static void getDate() {
        try {
            Statement statement = getConnection().createStatement();
            ResultSet result = statement.executeQuery("Select * from products");
            while (result.next()) {
                System.out.println(result.getString("id")
                        + " " + result.getString("name") + " "
                        + " " + result.getString("country"));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public static void insertData() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter ID, name, country form new inserting data");
            int id = scan.nextInt();
            String name = scan.next();
            String country = scan.next();
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("insert into products(id, name, country) values(" + id + ",'" + name + "','" + country + "')");
            if (result == 1) {
                System.out.println("Inserted data successfully");
            } else {
                System.out.println("insert data failed");
            }
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
    }

    public static void deleteData() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter ID to delete record");
            int id = scan.nextInt();
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("delete from products where id=" + id);

            if (result == 1) {
                System.out.println("Deleted data successfully");
            } else {
                System.out.println("Delete data failed");
            }
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
    }

    public static void updateData() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter id to update record");
            int id = scan.nextInt();
            System.out.println("change name and country to change data");
            String name = scan.next();
            String country = scan.next();
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("update products set name='" + name + "', country= '" + country + "'where id=" + id);
            if (result == 1) {
                System.out.println("Updated data successfully");
            } else {
                System.out.println("Update data failed");
            }
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
    }

    public static void getRecordWithInput() {
        try {
            System.out.println("Enter ID : ");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            Statement statement = getConnection().createStatement();
            ResultSet result = statement.executeQuery("Select * from products where id =" + input);
            while (result.next()) {
                System.out.println(result.getString("id")
                        + " " + result.getString("name") + " "
                        + " " + result.getString("country"));
            }
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
    }

}
