package com.mycompany.firstJava.ch03;

public class Tr_CompareOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ch03.06
		
		// 비교 연산자 ( == , !=  , < , <= , > , >= )
		
		
		int a = 10;
		int b = 20;
		
		boolean result1 = ( a==b );
		System.out.println("result1: " + result1);  // == 같다
		
		boolean result2 = ( a!=b );
		System.out.println("result2: " + result2);	// != 같지 않다.
		
		boolean result3 = ( a < b );
		System.out.println("result3: " + result3);	// ㄱ<ㄴ ㄱ이 ㄴ보다 작다
		
		boolean result4 = ( a <= b );
		System.out.println("result4: " + result4);	// <= 작거나 같다 
		
		boolean result5 = ( a > b );
		System.out.println("result5: " + result5);	// > 앞항이 뒤항보다 크다
		
		boolean result6 = ( a >= b );
		System.out.println("result6: " + result6);	// >= 앞항이 뒤항보다 크거나 같다
		
		
		
		
		
	}

}
