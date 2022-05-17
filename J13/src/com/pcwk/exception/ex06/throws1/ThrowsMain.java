/**
* <pre>
* com.pcwk.exception.ex06.throws1
* Class Name : ThrowsMain.java
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
package com.pcwk.exception.ex06.throws1;

import com.pcwk.cmn.LoggerManager;

/**
 * @author gimdongseon
 *
 */
public class ThrowsMain implements LoggerManager {

	/**
	 * @param args
	 */

	public static void methodA() throws Exception {
		LOG.debug("metodA()");
		Exception e = new Exception("메서드A 예외발생!");
		throw e;
	}
// 예외던지기:예외 회피!

	public static void main(String[] args) throws Exception {
		methodA();

	}

}
