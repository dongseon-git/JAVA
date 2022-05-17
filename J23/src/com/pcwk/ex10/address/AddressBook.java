package com.pcwk.ex10.address;
//VO(Value Object)
//VO란 이렇게 도메인에서 한 개 또는 그 이상의 속성들을 묶어서 특정 값을 나타내는 객체를 의미한다
public class AddressBook {

	   public static void main(String[] args) {
		   int[] arr = new int[5];
		   int n = 0;
		   int i = 0;
		   for(i=0; i< arr.length;i++) {
			   arr[i] = n;
			   n += 10;
			   
		   }
		   arr[arr.length]= 100; 
	   }

}
	
