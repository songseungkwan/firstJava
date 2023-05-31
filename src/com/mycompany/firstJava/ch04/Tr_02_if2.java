package com.mycompany.firstJava.ch04;

public class Tr_02_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 1;		// 등급
		int cost = 12000;	// 정가
		
		double salesCost = 0.0;
		// 일반 5% , 브론즈 10% , 실버 15% , 골드 20% , 플래티넘 2.7% 할인율 
		
		if(grade == 1) {
			salesCost = cost * (1-0.05); 
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)salesCost + "원 입니다.");
			
		} else if (grade == 2) {
			salesCost = cost * (1-0.1); {
				
			}
		}
	}

}
