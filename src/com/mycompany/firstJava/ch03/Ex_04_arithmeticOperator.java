package com.mycompany.firstJava.ch03;

public class Ex_04_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ch03.04
		
		// 산술 연산자 ( + , - , * , / , % )
		
		
		

		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("result1: " + result1);
		
		int result2 = v1-v2;
		System.out.println("result2: " + result2);
		
		int result3 = v1*v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1/v2;
		System.out.println("result4: " + result4);	// 2 -> 
		
		int result5 = v1%v2;
		System.out.println("result5: " + result5);
		
		double result6 = (double)v1 / v2;			// casting
		System.out.println("result6: " + result6);	// 두 개의 정수를 우리가 아는 선으로 나누기할때 (실수 범위에서 , 평균값) 
		
		
		
	}

}
