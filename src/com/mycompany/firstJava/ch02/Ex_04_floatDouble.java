package com.mycompany.firstJava.ch02;

public class Ex_04_floatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double var1 = 3.0;
		double var2 = 3;
		// 정수형이지만 무조건 소수점 출력함. 범위가 넓음.
		double var3 = 3.14;
		float var4 = 3.14F;
		float var5 = 3.14f;
		// 무조건 F를 넣어야함. 
		System.out.println("var1:"+ var1);
		System.out.println("var2:"+ var2);
		
		System.out.println("var3:"+ var3);
		System.out.println("var4:"+ var4);
		System.out.println("var5:"+ var5);
		
		double var6 = 1234567;			// 7자리
		double var7 = 123456789; 		// 8자리 이상 (E8 = 10^8)
		
		System.out.println("var6:"+ var6);
		System.out.println("var7:"+ var7);
		
		float var8 = 3;
		float var9 = 3f;
		float var10 = 3F;
		// double과 동일하게 소수점으로 출력. 범위가 좁음. 
		System.out.println("var8:"+ var8);
		System.out.println("var9:"+ var9);
		System.out.println("var10:"+ var10);
	}

}
