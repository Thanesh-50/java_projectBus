package Bus_Reservation_System;
import java.sql.SQLException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
 String passengerName;
 int busNo;
 Date date;
public Booking() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter passenger name: ");
	passengerName=sc.next();
	System.out.println("Enter Bus no: ");
	busNo=sc.nextInt();
	System.out.println("Enter Date DD-MM-YYYY: ");
	String dateInput=sc.next();
	try {
		date=new SimpleDateFormat("DD-MM-YYYY").parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    sc.close();
} 
public  boolean isAvailable() throws SQLException {
	BusDAO busdao=new BusDAO();
	BookingDAO bookingdao=new BookingDAO();
	int capacity=busdao.getCapacity(busNo);
	
		
	
	int booked=bookingdao.getBookedCount(busNo,date);
	
	
	return booked<capacity?true:false;
}
}
