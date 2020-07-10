package com.Java.concepts;

public class InterfaceExample implements printable{
	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.print();
	}

	public void print() {
		System.out.println("Hello");
	}
}

interface printable {
	void print();
}