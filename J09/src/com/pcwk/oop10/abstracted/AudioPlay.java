package com.pcwk.oop10.abstracted;

public class AudioPlay extends Play {

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("Play()호출"+pos);
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop()호출");
	}

}
