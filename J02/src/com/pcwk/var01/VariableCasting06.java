/**  
 패키지:com.pcwk.var01
 파일 :VariableCasting06.java
 작성자:gimdongseon

 */
package com.pcwk.var01;

public class VariableCasting06 {
	// 묵시적 형변환의 반대의 경우를 말한다
	// 변환 되는 자료형을 명시해야 한다. 자료의 손실이 발생할 수 있다.
	public static void main(String[] args) {
		// 큰 수를 작은 변수에 할당.
		int iNum = 11;
		byte bNum = (byte) iNum;
		System.out.println("iNum=" + iNum);
		System.out.println("bNum=" + bNum);
		int iNum01 = 1000;
		byte bNum01 = (byte) iNum01;
		System.out.println("iNum01=" + iNum01);// 1000
		System.out.println("bNum01=" + bNum01);// 쓰레기
		// 더 정밀한 수에서 덜 정밀한 변수로 대입
		double dNum02 = 3.14;
		int iNum02 = (int) dNum02;
		System.out.println("dNum02=" + dNum02);
		System.out.println("iNum02=" + iNum02);

	}

}
