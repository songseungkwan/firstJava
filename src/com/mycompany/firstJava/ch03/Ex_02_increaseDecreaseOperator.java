package com.mycompany.firstJava.ch03;

public class Ex_02_increaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.02
		
		// 증감 연산자(++,--)
		
		int i = 0;
		int j = 0;
		
		++i;	// 앞에 있으면 i를 먼저 증가 후 다른 식을 연산한다.
		j++;	// 뒤에 있으면 다른 식을 먼저 연산 후 j를 증감한다. (뒤에 걸 더 많이 씀)
		
			System.out.println("i: " + i);
			System.out.println("j: " + j);
		
			
		int k = i++;		// i를 k에 대입한 후 , i를 1 증가 -> k=1,i=2
		int m = ++j;		// j를 1 증가한 후 , j를 m에 대입 -> m=2,j=2
		
			System.out.println("k: " + k);
			System.out.println("i: " + i);
			System.out.println("m: " + m);
			System.out.println("j: " + j);
		
	
		
		int a = 1;
		int b = 1;
		
			--a; 	// a를 먼저 감소 후 다른 걸 연산
			b--; 	// 다른 걸 먼저 연산 후 b를 감소 (뒤에 걸 더 많이 씀)
	
			System.out.println("a: " + a);
			System.out.println("b: " + b);
	
			
			--i;							// i는 1 
			int z = ++i + j++;				// 1. i를 먼저 증가  
			System.out.println("z: "+z);
			System.out.println("i: "+i);
			System.out.println("j: "+j);
	
		
		
		
	}

}
