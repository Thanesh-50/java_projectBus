package Bus_Reservation_System;
import java.util.Scanner;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) { 
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Booking> booking = new ArrayList<Booking>();
		int userOpt=1;
		 buses.add(new Bus(1,true,2));
	   		
		Scanner sc= new Scanner(System.in);
		while (userOpt==1) {
			 System.out.println("Enter 1 to Book and 2 to Exit \n***************");
           userOpt=sc.nextInt();
           if (userOpt==1) {
			Booking booking1= new Booking();
			if(booking1.isAvailable(booking,buses)) {
				booking.add(booking1);
				System.out.println("Your booking is confirmes");
			}
	}else {
			System.out.println("Sorry bus is full.Try another Bus or date");
			break;
		}
          
   		for(Bus b:buses) {
   			b.displayBusIfo();
   			System.out.println();
   		}
		}
sc.close();
	}

}
