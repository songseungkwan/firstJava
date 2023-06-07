package com.mycompany.firstJava.ch04;

public class Ex_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int min = 1;
		int max = 45;
		
		
		// int random = ((Math.random() * (max-min)) + min);  		// casting 필요	
		
		int random = (int)((Math.random() * (max-min)) + min);				// math :jdk의 기능
		System.out.println("random: " + random);
		
		
	
		int random1 = (int)((Math.random() * (max-min)) + min);
		int random2 = (int)((Math.random() * (max-min)) + min);

		int sum = random1 + random2;
		System.out.println("두 값의 합: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
