package com.mycompany.firstJava.ch05;

public class Ex_02_ArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		int[][] score = {{99,88,55} , {11,22,33} , {55,77,99} , {33,88,22} ,{22,44,66}};
		
		String[] name = {"장동건","하정우","소지섭","강동원","이병헌"};

		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
//				System.out.println("score["+i+"]["+j+"]: "+ score[i][j]);
			}
//			System.out.println("---------------------------------");
		}
		
		// kor,eng,math 과목별 총합과 평균.
		// 사람별 총합과 평균.

		

		
		
//		for (int i = 0; i < scoreChemistry.length; i++) {
//			System.out.println(scoreChemistry[i]);
//			sum = sum + scoreChemistry[i];
//		}
//		System.out.println("sum: " + sum);
		
//		int sum = 0;
		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.println(score[i][j]);
//				sum = sum + score.length;
//			}
//			
//			
//		}
//		System.out.println("sum: " + sum);
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		int[] each = {0,0,0,0,0};
		
		double sum=0, avg=0;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++)
			sumKor+=score[i][0];
			sumEng+=score[i][1];
			sumMath+=score[i][2];
        }
		 avg=sum/(score.length);
		System.out.println(sumKor);
		System.out.println(sumEng);
		System.out.println(sumMath);
		System.out.println("score 평균은 "+ avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
				
				
				
		
		

