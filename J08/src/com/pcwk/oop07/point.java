package com.pcwk.oop07;

public class point {
	int x;
	int y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * x,y 좌표
	 * 
	 * @return x,y좌
	 */
	public String getLocation() {
		return "x:" + x + ", y:" + y;

	}
}
