package com.mycompany.firstJava.ch04;

public class Ex_06_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		int num = 1;
//		
//		switch (num) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break; // 조건이 충족하면 실행중단하라는 뜻.
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;	
//			
//		default:
//			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
//			break;
//		}
		
		// 사장 , 부장 , 과장 , 대리 , 주임 , 사원 , 나
		// 1000000 , 100000 , 10000 , 1000 , 100 , 10 ,1
		int positions = 1000000;
		
		switch (positions) {
		case 1000000000:
			System.out.println("사장의 연봉은 1000000000원 입니다.");
			break;
		case 100000000:
			System.out.println("부장의 연봉은 100000000원 입니다.");
			break;
		case 10000000:
			System.out.println("과장의 연봉은 10000000원 입니다.");
			break;
		case 1000000:
			System.out.println("대리의 연봉은 1000000원 입니다.");
			break;
		case 100000:
			System.out.println("주임의 연봉은 100000원 입니다.");
			break;
		case 10000:
			System.out.println("사원의 연봉은 10000원 입니다.");
			break;	
		case 1000:
			System.out.println("나의 연봉은 1000원 입니다.");
			break;	

		default:
			System.out.println("범위에 없습니다.");
			break;
		}
		
		String position = "과장";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
