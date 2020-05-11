package com.java.training.String;

public class String_Demo {
	
	public static void main(String[] args) {
		
		// Immutable
		String show = "My JAVA";
		
		char[] showArr = show.toCharArray();
		
		System.out.println("*****SLICING********");
		System.out.println(show.substring(4));
		
		
		
		for(int number=0;number<showArr.length;number++)
		{
			System.out.println(showArr[number]);
		}
		
		System.out.println("******Showarr"+String.valueOf(showArr));
		
		//Mutable : Add, delete, reverse
		
		System.out.println("Before reverse   "+show);
		StringBuilder stb = new StringBuilder(show);
		stb.reverse();
		System.out.println("After reverse   "+stb);
		
		String galaxy = "Samsung";
		String mi4 = "Samsung";
		
		if(galaxy.equals(mi4))
		{
			System.out.println("******Equal");
		}
		
		if (galaxy == mi4)
		{
			System.out.println("*****Equal**********");
		}
		else
		{
			System.out.println("***Not **Equal**********");
		}
		
		String galaxy1 = new String("Samsung");
		String mi41 = new String("Samsung");
		
		if (galaxy1 == mi41)
		{
			System.out.println("*****Equal***new*******");
		}
		else
		{
			System.out.println("***Not **Equal** new********");
		}
		
		
	}

}
