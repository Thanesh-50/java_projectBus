package Bus_Reservation_System;
import java.util.Date;
import java.sql.*;
public class BookingDAO {
public int getBookedCount(int busNo,Date date)throws SQLException {
	
	String query="select count(passenger_name) from booking where bus_no =? and travel_date=?";
	Connection con= Db_connection.getConnection();
	PreparedStatement pst= con.prepareStatement(query);
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	pst.setInt(1, busNo);
	pst.setDate(2, sqldate);
	ResultSet rs=pst.executeQuery();
	rs.next();
	return rs.getInt(1);
}
public void addBooking(Booking booking1) throws SQLException {
	String query="insert into booking value(?,?,?)";
	Connection con= Db_connection.getConnection();
	PreparedStatement pst= con.prepareStatement(query);
	java.sql.Date sqldate=new java.sql.Date(booking1.date.getTime());
	pst.setString(1, booking1.passengerName);
	pst.setInt(2,booking1.busNo);
	pst.setDate(3, sqldate);
	pst.executeUpdate();
}
}
