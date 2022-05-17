package com.pcwk.util.ex03.singleton;

public class SingleToneMain {

	public static void main(String[] args) {
		//the constructor SingleTone() is not visible
		//SingleTone s01 = new SingleTone();
		SingleTone s01 = SingleTone.getInstance();
		SingleTone s02 = SingleTone.getInstance();
				
		System.out.println("s01:"+s01);
		System.out.println("s02:"+s02);
	}

}
//s01:com.pcwk.util.ex03.singleton.SingleTone@15db9742
//s02:com.pcwk.util.ex03.singleton.SingleTone@15db9742
