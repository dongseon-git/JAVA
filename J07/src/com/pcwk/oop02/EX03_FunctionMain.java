package com.pcwk.oop02;

public class EX03_FunctionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 13;
		
	int sum	=add(first, second);
		System.out.println(first + "+"+second+"="+sum);

		int substract = subtract(first, second);
		System.out.println(first + "-"+second +"="+ substract);
		
		int multi = multiply(first, second);
		System.out.println(first + "*"+second +"="+ multi);
	
		double div= divide(first, second);
		System.out.println(first + "/"+second +"="+ div);
	
      
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double divide(int num1, int num2) {
		return num1/(1.0*num2);
	}
	

	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
/**
 * 빼기
 * @param num1
 * @param num2
 * @return num1 - num2
 */
	public static int subtract(int num1,int num2) {
		return num1 - num2;
	}
	
	
	/**
	 * 두수 더하기!
	 * @param num1
	 * @param num2
	 * @return result
	 */
	
	public static int add(int num1, int num2) {
		int result = 0;
		
		result = num1+ num2;
		
		return result;
		
	}
}
