package com.mycompany.firstJava.ch03;

public class Ex_07_stringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch.03.07
		
		// 문자열 관련
		
		String str1 = "장원영";				// 값이 같으면 변수가 달라도 메모리 주소가 같다.
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2); 
		System.out.println("result1=" + result1);	// true
		
		boolean result2 = (str1 == str3); 
		System.out.println("result2=" + result2);	// false
		
		// ★★★
		System.out.println(str1.equals(str2));  // str1과 str2의 메모리 주소가 같은지 확인.
		System.out.println(str1.equals(str3));
		
		
		
		
	}

}
