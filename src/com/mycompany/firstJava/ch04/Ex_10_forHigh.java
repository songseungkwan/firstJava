package com.mycompany.firstJava.ch04;

public class Ex_10_forHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. (10*5)
		// **********
		// **********
		// **********
		// **********
		// **********
		// 출력하는 프로그램을 만드시오.
		
		// 2. (1,5번째 출력)
		// **********
		// *        *
		// *        *
		// *        *
		// **********
		// 출력하는 프로그램 만드시오.
		
		
//		for(int i=1; i<=5; i++ ) {
//			System.out.println("**********");
//		}
		
		
		
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=10; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		2번
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
		System.out.println("---------------------------------");
			
		
		// 숫자 패턴 만들기
		
		for(int i=0; i <= 8; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		
		

		for (int i = 1; i < 6; i++) {
		    System.out.print((i * 2 - 1) + " ");
		}
		System.out.println(0);
				
				System.out.println("---------------------------------");
		
		// 선생님 코드
				
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
