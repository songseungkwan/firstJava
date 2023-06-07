package com.mycompany.firstJava.ch04;

public class Ex_enumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 위에는 변수, 아래는 이넘타입
		
		int a = 1;
		Week week;   // 클래스는 대문자 시작이기때문에 Week도 클래스. ( 소문자로 시작하면 변수 or 함수) 
		String abc;
		
//		abc = Week.MONDAY // "Monday" // error:type mismatch (자바는 데이터 타입에 엄격하다.)
		abc = Week.MONDAY.toString();  // "MONDAY"	(캐스팅->>>  " toString(); " )
		
		
		week = Week.MONDAY;

		System.out.println(abc);
		
	
		
		
		
		
	}

}




