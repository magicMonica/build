/*******************************************************************************
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2017年3月15日 上午10:21:36
 *******************************************************************************/

package com.web.lyt;

import org.junit.Test;

public class MyTest {

	@Test
	public void query() throws Exception{
		int a = 1;
		int b = 2;
		int c = a/b;
		int d = a/c;
		System.out.println(d);
	}
	
	@Test
	public void query1(){
		int a = 3;
		int b = 2;
		int c = a/b;
		int d = a/c;
		System.out.println(d);
	}
}
