package com.mycompany.firstJava.ch03;

public class Ex_06_compareOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.06
		
		// 비교 연산자 ( == , !=  , < , <= , > , >= )
		
		int a = 10;
		int b = 20;
		
		
		boolean result1 = ( a==b);					// == : 같다
		System.out.println("result1: "+ result1 );
		
		boolean result2 = (a != b);					// != : 같지 않다
		System.out.println("result2: "+ result2 );
		
		boolean result3 = (a < b);					// < : (앞이) 작다 
		System.out.println("result3: "+ result3 );
		
		boolean result4 = (a <= b);					// <= : (앞이) 작거나 같다
		System.out.println("result4: "+ result4 );
		
		boolean result5 = (a > b);					// > : (앞이) 크다
		System.out.println("result5: "+ result5 );
		
		boolean result6 = (a >= b);					// >= : (앞이) 크거나 같다
		System.out.println("result6: "+ result6 );
		
		
		
		
		
		
		
	}

}
