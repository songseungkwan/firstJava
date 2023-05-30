package com.mycompany.firstJava.ch03;

public class TrIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// ch03.02
		
		// 증감 연산자(++,--)
		
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		int k = i++;
		int m = ++j;
		
		
		System.out.println("k " + k);
		System.out.println("i " + i);
		System.out.println("m " + m);
		System.out.println("j " + j);
		
		--i;                  // i = 1
		int z = ++i + j++;    // i=2 , z=2+2=4 , j=2+1=3
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("z: " + z);
		
		
		
		
		
		
		
		int a = 1;
		int b = 1;

		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		
		
		
	}

}
