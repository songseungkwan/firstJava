package com.mycompany.firstJava.ch04;

public class Ex_02_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int grade1 = 1;
//		int grade2 = 2;
//		int grade3 = 3;
//		int grade4 = 4;
//		int grade5 = 5;
//		
//		int cost = 12000;
//		
//		if (grade1 == 1) {
//			System.out.println("정가가 12000원인 일반 등급의 할인가는 11,400원입니다.");
//		} else if ( grade2 == 2) {
//			System.out.println("정가가 12000원인 브론즈 등급의 할인가는 10,800원입니다.");	
//		} else if ( grade3 == 3) {
//			System.out.println("정가가 12000원인 실버 등급의 할인가는 10,200원입니다.");
//		} else if ( grade4 == 4) {
//			System.out.println("정가가 12000원인 골드 등급의 할인가는 9,600원입니다.");
//		} else {
//			System.out.println("정가가 12000원인 플래티넘 등급의 할인가는 11,676원입니다.");
//		}

		// 일반 5% , 브론즈 10% , 실버 15% , 골드 20% , 플래티넘 2.7% 할인율
		
		
		
		
		
		int grade = 0;
		int cost = 12000;
		double salesCost = 0.0;
		
		if (grade == 1) {
			salesCost = cost * (1- 0.05);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는 : " + (int)salesCost + "원 입니다." );
		} else if ( grade == 2) {
			salesCost = cost * (1-0.1);
			System.out.println("정가가" + cost + "원인 브론즈 등급의 할인가는 : " + (int)salesCost + "원 입니다.");	
		} else if ( grade == 3) {
			salesCost = cost * (1-0.15);
			System.out.println("정가가" + cost + "원인 실버 등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		} else if ( grade == 4) {
			salesCost = cost * (1-0.2);
			System.out.println("정가가" + cost + "원인 골드 등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		} else if( grade == 5) {
			salesCost = cost * (1-0.027);
			System.out.println("정가가" + cost + "원인 플래티넘 등급의 할인가는 : " + (int)salesCost + "원 입니다.");
		} else {
			System.out.println("1~5 까지의 grade만 가능합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
