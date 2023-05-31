package com.mycompany.firstJava.ch03;

public class Tr_conditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.10 ★★★★★★★★★★★★★
		
		// 삼항 연산자 (조건식)? A : B   (조건식이 참이면 a, 거짓이면 b)
		
		
		int math = 85;
		
		char grade = (math>90)? 'A' : 'B' ;			// math가 90보다 크면 'A'를 출력, 90보다 작으면 'B'를 출력해라
		System.out.println("grade: " + grade);
		
		
		if(math > 90) {
			grade = 'A';
			
		} else {
			grade = 'B';
		
		System.out.println("grade: " + grade);
		}

	}
}