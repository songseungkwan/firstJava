package com.mycompany.firstJava.ch04;

public class Ex_enumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 위에는 변수, 아래는 이넘타입
		
		int a = 1;
		Week week;
		String abc;
		
//		abc = Week.MONDAY // "Monday" // error:type mismatch
		abc = Week.MONDAY.toString();  // "MONDAY"
		
		
		week = Week.MONDAY;

		System.out.println(abc);
		
	
		
		
		
		
	}

}




