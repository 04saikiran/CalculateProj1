package com.test;

public class SumMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		int val1 = sumOfTwoNum(a, b);
		System.out.println("Sum of two number is : " + val1);

		int val2 = mulOfTwoNumber(a, b);
		System.out.println("Multiplication of same 2 number is : " + val2);

	}

	public static int sumOfTwoNum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int mulOfTwoNumber(int a, int b) {
		int result = a * b;
		return result;
	}

}
