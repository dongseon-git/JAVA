/**  
 패키지:com.pcwk.var01
 파일 :VariablelmplicitConversion.java
 작성자:gimdongseon

 */
package com.pcwk.var01;

public class VariablelmplicitConversion {
	// 묵시적 형변환
	// 작은 수에서 큰수로, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경
	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum; // byte형 값이 int 형으로 자동 변환
		System.out.println("bNum:" + bNum);
		System.out.println("iNum:" + iNum);

		// 덜 정밀한 수에서 더 정밀한 수 대입
		int iNum02 = 14;
		float fNum = iNum02;
		System.out.println("iNum02:" + iNum02);// 14
		System.out.println("fNum:" + fNum);// 14.0
		double dNum;
		// 14.0 + 11 -> 14.0+11.0
		dNum = fNum + iNum;
		System.out.println("fNum+iNum=" + dNum);// 25.0

	}

}
