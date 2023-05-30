package com.mycompany.firstJava.ch03;

public class Ex_10_conditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.10 ★★★★★★★★★★★★★
		
		// 삼항 연산자 (조건식)? A : B   (조건식이 참이면 a, 거짓이면 b)
		
		int math = 85;
		
		char grade = (math>90)? 'A' : 'B';
		System.out.println("grade: " + grade);
		
		
		// 삼항 연산자를 쓰는 이유는 코드의 간결성 때문 ( 아주 많이 쓰이지만 이분법으로만 가능하다.)
		if(math > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println("grade: " + grade);
		
	}

}
