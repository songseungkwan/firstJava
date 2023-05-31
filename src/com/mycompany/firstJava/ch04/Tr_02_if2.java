package com.mycompany.firstJava.ch04;

public class Tr_02_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 5;		// 등급
		int cost = 12000;	// 정가
		double salesCost = 0.0;
		
		// 일반회원 5% 할인
		// 브론즈 10% 
		// 실버 15%
		// 골드 20%
		// 플래티넘 2.7% 
		
		// 구하고자 하는 값: 해당 회원의 등급에 따라 정가에서 등급할인이 적용된 금액.
		
		if( grade == 1) {
			salesCost = cost * (1-0.05); 
				System.out.println("정가가 " + cost + "원인 제품의 일반회원 등급 할인가는 " + (int)salesCost + "원 입니다.");
			}else if ( grade==2 ) {
				salesCost = cost * (1-0.1);
				System.out.println("정가가 " + cost + "원인 제품의 브론즈회원 등급 할인가는 " + (int)salesCost + "원 입니다." );
			}else if ( grade==3) {
				salesCost = cost * (1-0.15);
				System.out.println("정가가 " + cost + "원인 제품의 실버회원 등급 할인가는 " + (int)salesCost + "원 입니다.");
			}else if ( grade==4) {
				salesCost = cost * (1-0.2);
				System.out.println("정가가 " + cost + "원인 제품의 골드회원 등급 할인가는 " + (int)salesCost + "원 입니다.");
			}else if ( grade==5) {
				salesCost = cost * (1-0.027);
				System.out.println("정가가 " + cost + "원인 제품의 플래티넘회원 등급 할인가는 " + (int)salesCost + "원 입니다.");
			}else {
				System.out.println("grade는 1~5까지만 존재합니다.");
			}
		
//		if( grade==1) {
//			System.out.println("정가가 12000원인 일반 회원등급의 할인가는 " + (cost -(cost/20)) + " 원 입니다.");
//		} else if( grade==2 ) {
//			System.out.println("정가가 12000원인 브론즈 회원등급의 할인가는 " + (cost -(cost/10)) + " 원 입니다.");
//		} else if( grade==3 ) {
//			System.out.println("정가가 12000원인 실버 회원등급의 할인가는 " + (cost -(cost/100*15)) + " 원 입니다.");
//		} else if( grade==4 ) {
//			System.out.println("정가가 12000원인 골드 회원등급의 할인가는 " + (cost -(cost/5)) + " 원 입니다.");
//		} else if( grade==5 ) {
//			System.out.println("정가가 12000원인 플래티넘 회원등급의 할인가는 " + (cost -(cost/1000*27)) + " 원 입니다.");
//		}
		
		
		
		
		
		}
	
		
		
	}


