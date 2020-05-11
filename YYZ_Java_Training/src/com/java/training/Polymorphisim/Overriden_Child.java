package com.java.training.Polymorphisim;

	

public class Overriden_Child extends Overriden_Parent{
	
	
	public void display() {
		System.out.println("******* Child******");
	}
	
	public static void main(String[] args) {
		Overriden_Child overridenDemo = new Overriden_Child();
		overridenDemo.display();
	}
	
}
