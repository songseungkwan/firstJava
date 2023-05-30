package com.mycompany.firstJava.ch02;

public class Ex_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// boolean
		boolean defalutNy;
		
		boolean default1Ny = true;
		boolean default2Ny = false;
		
		if(default1Ny) {
			System.out.println("기본값 입니다.");
		} else {
			System.out.println("여분값 입니다.");
		}
		
		
		
	// byte
		
		// byte : -128 ~ 127 
		
		byte number1 = -128; 
		byte number2 = 127;
		// byte number3 = -129;
		
		System.out.println("number1:"+ number1);
		System.out.println("number2:"+ number2);
		// System.out.println(number3);
		
		
	// char
		
		char c1 = 'A'; 			// 문자
		char c2 = 65;			// 10진수
		char c3 = '\u0041';		// 16진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char c4 = '가';			// 문자
		char c5 = 44032;		// 10진수			
		char c6 = '\uac00';		// 16진수
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1;
		int uniCode2 = c4;
		
		System.out.println(uniCode);
		System.out.println(uniCode2);
		
	// floatDouble
		
		double var1 = 3.0;
		double var2 = 3;
		
		System.out.println(var1);
		System.out.println(var2);
		
		double var3 = 3.14;
		float var4 = 3.14f;  
		float var5 = 3.14F;
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		double var6 = 1234567;
		double var7 = 12345678;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		
		
	// int
		
		int var11 = 10;		// 10진수
		int var12 = 012;	// 8진수
		int var13 = 0xa;	// 16진수
		
		System.out.println("var11: "+ var11);
		System.out.println("var12: "+ var12);
		System.out.println("var13: "+ var13);
		
	// long
		
		long var14 = 10;
		long var15 = 1234567894546546546L;		// 맨 뒤에 L 붙임.
		
		System.out.println("var14: "+ var14);
		System.out.println("var15: "+ var15);
		
	// promotion
		// byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar: " + byteVar);
		
		short shortVar = byteVar; 
		System.out.println("shortVar: "+ shortVar);
		
		int intVar = shortVar; 
		System.out.println("intVar: "+ intVar);
		
		long longVar = intVar; 
		System.out.println("longVar: "+ longVar);
		
		float floatVar = longVar; 
		System.out.println("floatVar: "+ floatVar);
		
		double doubleVar = floatVar; 
		System.out.println("doubleVar: "+ doubleVar);
		
		
		
		
		
	}

}
