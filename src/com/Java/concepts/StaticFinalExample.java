package com.Java.concepts;

public class StaticFinalExample {

	// static blank final variable
	static final int ROLL_NO;
	static {
		// Static final variable if not initialized while declaring can only be initialized in static block
		ROLL_NO = 1230; 
	}

	public static void main(String args[]) {
		System.out.println(StaticFinalExample.ROLL_NO);
	}
}
