package com.mycompany.firstJava.ch04;

public class Tr_01_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ch04.01
		
				// if - 학점 계산
				// A- 90
				// B- 89~80
				// C- 79~70
				// D- 69~60
				// F- 59~
				
				//  97 A 93 A- 90 
		
		int score = 70;
		
		
//		if( score >= 90 ) {
//			System.out.println("당신의 학점은 A입니다.");
//		} else if ( score >= 80) {
//			System.out.println("당신의 학점은 B입니다.");
//		} else if ( score >= 70) {
//			System.out.println("당신의 학점은 C입니다.");
//		} else if ( score >= 60) {
//			System.out.println("당신의 학점은 D입니다.");
//		} else {
//			System.out.println("당신의 학점은 F입니다.");
//		}
		
		if(score>=90) {
//			if(score<93) {
//				System.out.println("당신의 학점은 A-입니다.");
//			} else if ( score <97) {
//				System.out.println("당신의 학점은 A입니다.");
//			} else {
//				System.out.println("당신은 A+입니다.");
//			}
//		}
			if(score>=97) {
				System.out.println("당신의 학점은 A+입니다.");
			} else if(score>93 && score<97) {
				System.out.println("당신의 학점은 A입니다.");
			} else {
				System.out.println("당신의 학점은 A-입니다.");
			}
			
		} else if(score>=80) {
			if(score>=87) {
				System.out.println("당신의 학점은 B+입니다.");
			} else if (score>83 && score < 87) {
			System.out.println("당신의 학점은 B입니다.");
			} else {
				System.out.println("당신의 학점은  B-입니다.");
			}
		
		} else if(score>=70) {
			if(score>=77) {
				System.out.println("당신의 학점은 C+입니다.");
			} else if(score>73 && score<77) {
				System.out.println("당신의 학점은 C입니다.");
			} else {
				System.out.println("당신의 학점은 C-입니다.");
		} 
			
		} else if(score>=60) {
			if(score>=67) {
				System.out.println("당신의 학점은 D+입니다.");
			} else if (score>63 && score<67) {
				System.out.println("당신의 학점은 D입니다.");
			} else {
				System.out.println("당신의 학점은 D-입니다.");
			}
			
		} else {
			System.out.println("당신은 F입니다.");
		}
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}