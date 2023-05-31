package com.mycompany.firstJava.ch03;

public class Tr_DenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.03
		
		// 논리 부정 연산자( ! )
		
		boolean play = true;
		
		play = !play;
		
		System.out.println("play:" + play);
		
		int i = 3;
		
		
//		if(i==3) {					// i가 3과 같다면
//			System.out.println("i: "+ i);
//
//		}
		
		if(!(i==3)) {
			System.out.println("i: "+ i );
		}
		// 해당 구문은 false라서 미출력됨.
		
		
		
	}

}
