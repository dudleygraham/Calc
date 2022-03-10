package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
	Calc c = new Calc();
	@Test
	public void testCase1() {
		assertEquals(c.add(1, 1), 2);
		//should evaluate to true
	}
	@Test
	public void testCase2() {
		assertEquals(c.convertCase("hello"),"HELLO");
	}
	@Test
	public void testCase3() {
	
	}
}
