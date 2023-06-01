package com.mycompany.firstJava.ch04;

public class Tr_04_if4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int 타입의 변수 2개를 선언하고 
// 		두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오.
		
//		(a,b)는 1사분면에 위치합니다.
		
		
		
		int a = 0;
		int b = -1;
		
			if(a>0 && b>0) {
				System.out.println("(a,b)는 1사분면 입니다.");
			} else if (a<0 && b>0) {
				System.out.println("(a,b)는 2사분면 입니다.");
			} else if (a<0 && b<0) {	
				System.out.println("(a,b)는 3사분면 입니다."); 
			} else if (a>0 && b<0) {
				System.out.println("(a,b)는 4사분면 입니다.");
			} else if (a==0 && b!=0) {
				System.out.println("(a,b)는 x축 위에 위치합니다.");
			} else if (a!=0 && b==0) {
				System.out.println("(a,b)는 y축 위에 위치합니다.");
			} else {
				// a==0 & b==0
				System.out.println("(a,b)는 원점입니다.");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
