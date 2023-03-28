import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
 
  static final String DB_CONNECTION_URL = "*"; /////////

  public static void main(String args[]) {
    Connection c = null;
    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection(DB_CONNECTION_URL);
      System.out.println("Connection Opened Successfully");

      Statement stmt = c.createStatement();
      System.out.println("Statement Created Successfully");

      //////////////////////////////

    /* ////////////// DROP TABLE ORDERS 
      String drop_table_instruction = "DROP TABLE ORDERS";
      stmt.executeUpdate(drop_table_instruction);
      System.out.println("Dropped table ORDERS in the database..."); */ 
      
      ////////////// CREATE TABLE Orders
      String create_table_instruction = "CREATE TABLE IF NOT EXISTS Orders" +
          "(OrderID SERIAL not NULL," +
          " CustomerNumber INTEGER" +
          " PRIMARY KEY ( OrderID ))";

      stmt.executeUpdate(create_table_instruction);
      System.out.println("Created table Orders in the database...");
      ////////////// TABLE CREATION SUCCESSFUL Orders

      ////////////// ADD ROW TO THE TABLE Orders
      System.out.println("Inserting records into the table...");
      String sql_add_row = "INSERT INTO ORDERS VALUES (DEFAULT,1)";
      stmt.executeUpdate(sql_add_row);
      System.out.println("Added row in the database...");
      ////////////// ADDED ROW SUCCESSFULLY
      
      ////////////// ADD ROW TO THE TABLE Orders
      System.out.println("Inserting records into the table...");
      sql_add_row = "INSERT INTO Orders VALUES (DEFAULT,2)";
      stmt.executeUpdate(sql_add_row);
      System.out.println("Added row in the database...");
      ////////////// ADDED ROW SUCCESSFULLY

      ////////////// QUERY THE TABLE ORDERS
      System.out.println("Selecting records from the table...");
      String select_query = "SELECT * FROM Orders";
      ResultSet rs = stmt.executeQuery(select_query);
      System.out.println("Query Results: ");

      while (rs.next()) {
        // Display values
        System.out.print("OrderID: " + rs.getInt("OrderID"));
        System.out.println(",CustomerNumber: " + rs.getInt("CustomerNumber"));
      }
      ////////////// QUERY RUN SUCCESFULLY

      create_table_instruction = "CREATE TABLE IF NOT EXISTS OrdersDetails" +
        " (OrderID SERIAL not NULL" +
        " CustumerNumber INTEGER" +
        " Chickens INTEGER, " +
        " PRIMARY KEY ( OrderID ))";

      ////////////// ADD ROW TO THE TABLE OrdersDetails
      System.out.println("Inserting records into the table...");
      sql_add_row = "INSERT INTO OrdersDetails VALUES (DEFAULT,1,5)";
      stmt.executeUpdate(sql_add_row);
      System.out.println("Added row in the database...");

      ////////////// ADD ROW TO THE TABLE OrdersDetails
      System.out.println("Inserting records into the table...");
      sql_add_row = "INSERT INTO OrdersDetails VALUES (DEFAULT,2,8)";
      stmt.executeUpdate(sql_add_row);
      System.out.println("Added row in the database...");

      ////////////// QUERY THE TABLE OrdersDetails
      System.out.println("Selecting records from the table...");
      select_query = "SELECT * FROM OrdersDetails";
      rs = stmt.executeQuery(select_query);
      System.out.println("Query Results: ");

      while (rs.next()) {
        // Display values
        System.out.print("OrderID: " + rs.getInt("OrderID"));
        System.out.print("CustumerNumber: " + rs.getInt("CustumerNumber"));
        System.out.println(",Chickens: " + rs.getInt("Chickens"));
      }
      ////////////// QUERY RUN SUCCESFULLY


    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
  }
}
