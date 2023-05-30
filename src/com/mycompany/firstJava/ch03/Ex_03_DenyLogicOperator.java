package com.mycompany.firstJava.ch03;

public class Ex_03_DenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.03
		
		// 논리 부정 연산자( ! )
		
		boolean play = true;
		
		play = !play;
		
		System.out.println("play: " + play);
		System.out.println("-------------------------------------");
		
		
		int i=3;
		
//		if(i==3) {							i가 3과 같다면 이라고 해석 
//			System.out.println("i:" + i);
//		}
		

		if(!(i==3)) {						
			System.out.println("i:" + i);
		}
		
		
		
		
		
		
	}

}
