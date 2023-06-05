package com.mycompany.firstJava.ch05;

public class Tr_01_ArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언
		int[] scoreEnglish;
		int scoreEngMath[];
// 모두 동일하다, 위에걸 최근에 더 많이 쓴다.
		
		//int[][][]...(무한 배열 가능하다) scoreEnglish;
		//int scoreEnglish[][][]...(무한 배열 가능하다);
		
		double[] total;
		double avg[];
		
		char[] grade202301;
		char grade202302[];
		
		boolean[] score0;
		boolean score1[];  // pass / non-pass
		
		
		
		// 선언과 초기화
		// 정수형
		int[] scoreChemistry = {100,99,98,97,96,95,94};
// 인덱스 번호는 0~4까지 , 실제 개수는 5개
		// scoreChemistry[7] = 93; // 여기서는 에러 안나지만 컴파일시 에러가 뜬다.(Out of bounds)
		// 초기화된 영역을 벗어나 선언하면 에러가 난다. array의 단점.
		scoreChemistry[0] = 0;
		scoreChemistry[1] = 195;
		scoreChemistry[2] = 111;		// 수정은 가능. 값을 바꾸는 것은 가능하지만 비우는 것(삭제)는 불가능하다.
		
		// 문자형 (string은 "" , char는 '')
		// String[] scoreStudent = {"임요환","이윤열","최연성"};
		
		// 단문자형
		// char[] scoreGrade = {'A','B','C','D','F'};
		
		
		
		// 선언과 초기화를 따로
		// int[] scorePhysics;
		// scorePhysics= {5,10,15}; // 에러뜬다. 배열은 선언과 초기화를 동시에 해야한다.
		
		
		int a = scoreChemistry.length;
		System.out.println(a);	// 7
		
		
		// 인덱스 순으로 요소 찾기
		System.out.println(scoreChemistry[0]);		// scoreChemistry 배열에서 인덱스 0번을 찾아라
		System.out.println(scoreChemistry[2]);		// scoreChemistry 배열에서 인덱스 2번을 찾아라
		
		System.out.println("-------------------------------");
		// 값을 뽑는 방법
		
		// 1. for문		2. while문		3. 향상된 for문
		// 1. for문
		
		int sum = 0;
		
		for(int i=0; i<scoreChemistry.length; i++) {
			System.out.println(scoreChemistry[i]);
			sum+=scoreChemistry[i];
		}
		System.out.println("sum: " + sum);
		
		// 학원
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
