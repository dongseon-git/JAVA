package com.pcwk.array;

public class EX08_MulArray {

	public static void main(String[] args) {
		int[] [] arr = { { 1, 2, 3 }, 
				{ 4, 5, 6 }
		};

		 System.out.println("arr.length:" + arr.length);//바깥 for length
		 System.out.println("arr[0].length:" + arr[0].length);//안쪽 for length
		 
		 for(int i = 0;i<arr.length;i++) {
			 for(int j =0;j<arr[0].length;j++) {
				 System.out.println(arr[i][j]+",");
			 }//for j
			 System.out.println();
		 }
	}

}
