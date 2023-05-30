package com.mycompany.firstJava.ch02;

public class EX09Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		double > float > long > int > short > byte
		
		double doubleVar = 123456789;
		System.out.println("doubleVar:"+ doubleVar);
		
		
		float floatVar = (float)doubleVar;
		System.out.println("float:" + floatVar);
		// 캐스팅 방법 : (작은 데이터타입명)변수명; 

		long longVar = (long)floatVar;
		System.out.println("long:" + longVar);
		
		int intVar = (int)longVar;
		System.out.println("int:" + intVar);
		
		short shortVar = (short)intVar;
		System.out.println("short:" + shortVar);
		
		byte byteVar = (byte)shortVar;
		System.out.println("byte:" + byteVar);
		
		
		System.out.println("---------------------------------------------");
		
		// 암기 부분
		// String stringVar = intVar; // 오류
		String stringVar = String.valueOf(intVar);
		System.out.println("stringVar: " + stringVar);
		// 문자형 - > 정수형
		
		// int intVar2 = stringVar; //오류
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println("intVar2: " + intVar2);
		// 정수형 - > 문자형
		
		
	}

}
