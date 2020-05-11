package com.java.training.Polymorphisim;

public class OverlaodingClass {
	
	public void mobile(int version)
	{
		System.out.println("******Mobile version********");
	}
	
	public void mobile(String Name)
	{
		System.out.println("******Mobile Name********");
	}
	public void mobile(int version,String Name)
	{
		
		System.out.println("******Mobile Name*****Version***");
	}
	
	public static void main(String[] args) {
		OverlaodingClass overloadingDemo = new OverlaodingClass();
		overloadingDemo.mobile(11);
		overloadingDemo.mobile("Andriod");
		overloadingDemo.mobile(11, "Apple");
	}

}
