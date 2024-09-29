package Bus_Reservation_System;
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
    
} 
public  boolean isAvailable(ArrayList<Booking>booking,ArrayList<Bus>buses) {
	int capacity=0;
	for(Bus bus:buses) {
		if(bus.getBusNo()==busNo) 
			capacity=bus.getCapacity();
		
	}
	int booked=0;
	for(Booking b:booking) {
		if(b.busNo==busNo && b.date.equals(date)) {
			booked++;
	}
	}
	return booked<capacity;
}
}
