package com.mycompany.firstJava.ch04;

public class Tr_05_if5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int 타입의 변수를 3개 선언하고 
//		세 정수중에서 최대값, 최소값을 구하는 프로그램을 작성하시오.
		
		
		
		int a = -1;
		int b = 5;
		int c = 6;
		
		
		// 확실하게 최대와 최소를 정해버린다. ex. a가 최소라면 b,c 둘 다에게 작게 범위를 설정한다.
		
		if( a!=b && b!=c && a!=c) {
			if(a>b && a>c) {
				System.out.println("a가 최대값 입니다.");
			} else if(b>a && b>c) {
				System.out.println("b가 최대값 입니다.");
			} else {
				System.out.println("c가 최대값 입니다.");
			}
			
			
		if (a<b && a<c) {
			System.out.println("a가 최소값 입니다.");
		} else if (b<a && b<c) {
			System.out.println("b가 최소값 입니다.");
		} else {
			System.out.println("c가 최소값 입니다.");
		}
		
		} else {
			System.out.println("적어도 동일한 2개의 정수가 존재합니다. 수정하세요.");
		}
		 
	}

}
