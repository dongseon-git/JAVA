/**
* <pre>
* com.pcwk.exception.ex03.multiblock
* Class Name : MultiBlockExceptionMain.java
* Description:
* Author: gimdongseon
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.exception.ex03.multiblock;

import com.pcwk.cmn.LoggerManager;

/**
 * @author gimdongseon
 *
 */
public class MultiBlockExceptionMain02 implements LoggerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LOG.debug("1");
		LOG.debug("2");
		int[] intArray = { 1, 2, 0, 3 };
		try {
			LOG.debug("3");
			LOG.debug(1 / 4);
			LOG.debug("4");
//jdk 1.7 이후가능
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// 예상되는 예외
			// LOG.debug("5"+e.getMessage());
			if (e instanceof ArithmeticException) {
				LOG.debug("5. ArithmeticException" + e.getMessage());
			} else if (e instanceof ArrayIndexOutOfBoundsException) {
				LOG.debug("5. ArrayIndexOutOfBoundsException" + e.getMessage());
			}

		} catch (Exception e) {// 그 외 모든 예외
			LOG.debug("6 Exception");
		} finally {
			LOG.debug("7 finally");
		}
		LOG.debug("8 종료");
	}

}
