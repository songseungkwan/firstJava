package com.mycompany.firstJava.ch04;

public class Tr_06_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; // 조건이 충족하면 실행중단하라는 뜻.
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;	
			
		default:
			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
			break;
		}
		
		
	}

}
