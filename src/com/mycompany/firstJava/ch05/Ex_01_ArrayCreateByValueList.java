package com.mycompany.firstJava.ch05;

import java.util.Iterator;

public class Ex_01_ArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 선언
		int[] scoreEnglish;
		int scoreMath[];
		
//		int[][][],,, scoreEnglish;
//		int scoreMath[][][],,,;
		// 무한배열 가능
		
		
		double[] total;
		double avg[];
		
		char[] grade202301;
		char grade202302[];
		
		
		boolean[] score;
		boolean score2[];
		
		
// 선언과 초기화
		//정수형
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		
//		scoreChemistry[7]= 93;		// 여기서는 에러 안남.
		// 초기화된 영역을 넘어서면 에러가 남. array의 단점. 
		scoreChemistry[0]= 0;			// 수정은 가능. 값을 바꾼다는 것이지 비울 수 는 없다.
		scoreChemistry[1]= 200;
		scoreChemistry[2]= 108;
		
		
		
		//문자형 string=double quote , char = single quote

		//		String[] scoreStudent = {"김아무개","이마마","최개똥","곽똥개","정정희"};
//		// 단문자형
//		char[] scoreGrade = {'A','B','C','D','F'};
		
//		int[] scorePhysics;
//		scorePhysics = {100,99,98,97,96}; // error 
		// 선언과 동시에 초기화
		
		int a = scoreChemistry.length;
		System.out.println(a);
		
		// 인덱스순으로 요소 찾기
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[6]);
		
		
		
		// 값을 뽑는 방법
		// 1.for문 2.향상된 for문(while문)
		// for문
		
		int sum=0; 				// 총합 구하기
		
		for (int i = 0; i < scoreChemistry.length; i++) {
			System.out.println(scoreChemistry[i]);
			sum = sum + scoreChemistry[i];
		}
		System.out.println("sum: " + sum);
//		
//		
//
//		
//		
//		
//		// while문
//		
//		int sum2 = 0;			// 총합 구하기
//		int i =0;
//		
//		while (i<scoreChemistry.length) {
//			System.out.println(scoreChemistry[i]);
//			sum2 = sum2 + scoreChemistry[i];
//			i++;
//		}
//		System.out.println("sum2: " + sum2);
//		
//		// 향상된 for문
//		
//		int sum3 = 0;
//		
//		for(int bb: scoreChemistry) {						// scoreChemistry에 클래스를 제외한 데이터묶음이 들어가야한다.
//			System.out.println(bb);
//			sum3 = sum3 + bb;
//		}
//		System.out.println("sum3: " + sum3);
//		// 인덱스가 없기에 무작위로 컨트롤 할떄 편하고 많이 쓰인다. jsp할때 많이 쓰임.
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
