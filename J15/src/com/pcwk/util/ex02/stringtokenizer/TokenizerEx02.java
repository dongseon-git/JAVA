package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx02 {

	public static void main(String[] args) {

		String expression = "x=100*(200+300)/2";
		// token delim return

		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", false);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
