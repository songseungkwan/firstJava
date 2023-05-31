package com.mycompany.firstJava.ch03;

public class Tr_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch.03.08
		
		// 논리 연산자 
		
		// &&  = & : and : 논리곱 : 연산 참참 => 참 , 나머지 다 false
		// ||  = | : or  : 논리합 : 연산 참 거짓 => 참 , 거짓 참 => 참, 참 참=> 참, 거짓 거짓=> 거짓
		// ^  : 배타적 논리합 : 연산 참 거짓 => 참 , 거짓 참 => 참, 참 참=> 거짓,  거짓 거짓=> 거짓
		
		
		
		int a = 65; 
		
		if(a>=65 && a<=70) {						// 참 && 참 => 참
			System.out.println("&&: true" );
		}
		
		if(a>65 || a<=70) {							// 거짓 || 참 => 거짓
			System.out.println("||:true");
		}
		
		if(a>65 ^ a<=70) {							// 거짓 ^ 참 => 참
			System.out.println("^: true");
		}
		
		if(a>=65 ^ a<=70) {							// 참 ^ 참 = 거짓
			System.out.println("^: true");
		}
		
		
		
		
		
		
	}

}
