package com.Java.concepts;

public class OverRidingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Company a = new Company(); // Company reference and object
			Company b = new eBay(); // Company reference but eBay object
	 
			a.address();// runs the method in Company class
			b.address();// Runs the method in eBay class
	}

}


class Company {
	 
	public void address() {
		System.out.println("This is Address of Crunchify Company...");
	}
}
 
class eBay extends Company {
 
	public void address() {
		System.out.println("This is eBay's Address...");
	}
}
