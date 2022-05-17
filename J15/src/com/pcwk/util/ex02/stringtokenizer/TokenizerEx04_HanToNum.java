package com.pcwk.util.ex02.stringtokenizer;

import java.util.StringTokenizer;

public class TokenizerEx04_HanToNum {
	// 한글로 된 숫자를 아라비아 숫자로 변환
	// 삼십만삼천백십오 -> 한글로 숫자 표시,단위표시
	// 303115
	public static void main(String[] args) {
		String input = "삼십만삼천백십오";// 결과 : 303115
		System.out.println(input);
		System.out.println(hanToNum(input));
	}

	public static long hanToNum(String input) {
		long result = 0;// 결과값
		long tmpResult = 00;// 십백천 단위의 값을 저장하기 위한 임시변수
		long num = 0;

		final String NUMBER = "영일이삼사오육칠팔";// 숫자
		final String UNIT = "십백천만억조";// 단위
		// 단위와 NUM_UNIT 배열 인덱스로 매핑!

		final long[] NUM_UNIT = { 10, 100, 1000, 10000, (long) 1e8, (long) 1e12 };

		StringTokenizer st = new StringTokenizer(input, UNIT, true);

		while (st.hasMoreTokens()) {

			String token = st.nextToken();
			//System.out.print(token);
			// 단위
			// 삽십만삼천백십오
			// "영일이삼사오육칠팔구"
			// -- "영일이삼사오육칠팔구".index(삼) --> 3
			int check = NUMBER.indexOf(token);// -1이 나오면 숫자에서는 없다.(단위)

			// System.out.println("," + check);

			if (check == -1) {// 단위인 경우
				if ("만억조".indexOf(token) == -1) { // token이 만억조가 아니면//3110
					// 바로 단위로 시작하면 (숫자가 없다)->1*단위
//					System.out.println("==================");
//					System.out.println("token:" + token);//십
//				    System.out.println("UNIT.indexOf(token):"+UNIT.indexOf(token));
//					System.out.println(" NUM_UNIT[UNIT.indexOf(token):" + NUM_UNIT[UNIT.indexOf(token)]);//1
//					System.out.println("==================");
					tmpResult += (num != 0 ? num : 1) * NUM_UNIT[UNIT.indexOf(token)];

				} else { // token 이 만억조가 아니면: 30000
					tmpResult += num;		
					result += (tmpResult != 0 ? tmpResult : 1) * NUM_UNIT[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;// num초기화
			} else { // 5
				num = check;
				// System.out.println("num:" + num);
			}

		} // ->while
		System.out.println("result :" + result);
		System.out.println("tmpResult:" + tmpResult);
		System.out.println("num:" + num);
		System.out.println("result + tmpResult + num:" + (result + tmpResult + num));
		return result + tmpResult + num;

	}

}
