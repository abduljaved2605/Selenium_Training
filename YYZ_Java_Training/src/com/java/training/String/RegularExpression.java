package com.java.training.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		Pattern  pm = Pattern.compile("New");
		Matcher mat = pm.matcher("geeks");
		
		System.out.println(Pattern.matches(".m", "am"));
		
		
	}

}
