package com.mycompany.firstJava.ch03;

public class Tr_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.04
		
		// 산술 연산자 ( + , - , * , / , % )
		
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2 ; 
		System.out.println("result1: " + result1);
		// 7
		
		int result2 = v1 - v2 ; 
		System.out.println("result2: " + result2);
		// 3
		
		int result3 = v1 * v2 ; 
		System.out.println("result3: " + result3);
		// 10
		
		int result4 = v1 / v2 ; 
		System.out.println("result4: " + result4);
		// 2 ,  5 / 2 = 2.5
		
		int result5 = v1 % v2 ; 
		System.out.println("result5: " + result5);
		// 1    5/ 2 = 2 * 2 + 1 , %는 나머지 값

		double result6 = v1 / v2 ;  // casting 미적용
		System.out.println("result6: " + result6);
		// 2.0
		
		double result7 = (double) v1 / v2 ; 
		System.out.println("result7: " + result7);
		// 2.5
		
	}

}
