
package login_log;
import java.sql.*;
import javax.xml.transform.Result;

public class sqlConnection {
    Connection con;
//   public static void main(String[] args) throws ClassNotFoundException,SQLException{
//        try{
//           
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
//     // line below needs to be modified to include the database name, user, and password (if any)
//  Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=shop;user=login077;password=0427087030;");
//  
//     System.out.println("Connected to database !");
// 
//   }
//   catch(SQLException sqle) {
//      System.out.println("Sql Exception :"+sqle.getMessage());
//   }
//   catch(ClassNotFoundException e) {
//    System.out.println("Class Not Found Exception :" + e.getMessage());
//   }
//   }
   
   public Connection createConnection(){
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=shop;user=login077;password=0427087030;");

            System.out.println("Connected to database !");
       }catch(Exception e){
            System.out.println("Exception While Creating Connection"+e.getMessage());
       }
    return con;
    }    

    
   
    
}
