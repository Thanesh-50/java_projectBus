package Bus_Reservation_System;

public class Bus {
 private int busNo;
  private boolean Ac;
  private  int capacity;

public Bus(int busNo, boolean ac, int capacity) {
	
	this.busNo = busNo;
	this.Ac = ac;
	this.capacity = capacity;
}

public boolean isAc() {
	return Ac;
}
public int getBusNo() {
	return busNo;
}

public void setBusNo(int busNo) {
	this.busNo = busNo;
}

public void setAc(boolean ac) {
	Ac = ac;
}
public  int getCapacity() {//accessor method
	return capacity;
}
public void setCapacity(int capacity) {//mutator
	this.capacity = capacity;
}
public void displayBusIfo() {
	System.out.println("Bus No: "+busNo+"Ac: "+Ac+"Total Capacity: "+capacity);
}
  
}
