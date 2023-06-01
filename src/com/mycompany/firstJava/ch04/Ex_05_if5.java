package com.mycompany.firstJava.ch04;

public class Ex_05_if5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최대값,최소값 구하기
		
//		int 타입의 변수를 3개 선언하고 
//		세 정수중에서 최대값, 최소값을 구하는 프로그램을 작성하시오.
		
		
		
		int a = -1;
		int b = -5;
		int c = -3; 
		
		
		
// max-val , min-val ->> "최대값은 x, 최소값은 y 입니다.
		
		
//		if (a > b) {
//			if ( b > c) {
//				System.out.println("최대값은 a, 최소값은 c입니다.");
//			} else  {
//				System.out.println("최대값은 a, 최소값은 b입니다.");
//			}
//		} if(b>a){
//			if(a>c) {
//				System.out.println("최대값은 b, 최소값은 c입니다.");
//			}
//		} else {
//				System.out.println("최대값은 b , 최소값은 a입니다.");
//	} if(c>a) {
//		System.out.println("최대값은 c, 최소값은 a입니다.");
//	} else {
//		System.out.println("최대값은 c, 최소값은 b입니다.");
//	}
	
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
