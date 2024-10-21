package com.frist.project;

public class test {

	public static void main(String[] args) {
	
		String original = "civic1";
		
		int len = original.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0;i--) {
			rev = rev+original.charAt(i);
			
		}
		
		if(original.equals(rev)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

	
	
	
	
}
