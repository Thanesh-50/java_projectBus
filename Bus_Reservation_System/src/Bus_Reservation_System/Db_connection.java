package Bus_Reservation_System;

import java.sql.*;

public class Db_connection {
  private static final String url="jdbc:mysql://localhost:3306/busreservation";
  private static final String username="root";
  private static final String password="nithin123";
   
 public static Connection getConnection() throws SQLException{
	  return DriverManager.getConnection(url, username, password);
  }
}
