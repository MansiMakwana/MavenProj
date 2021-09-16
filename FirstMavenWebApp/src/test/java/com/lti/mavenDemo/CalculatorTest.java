package com.lti.mavenDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		assertEquals(10, new Calculator().getSum(5, 5));
	}
	
	@Test
	public void test2() {
		assertEquals(15, new Calculator().getSum(10, 5));
	}
	
	@Test
	public void test3() {
		assertEquals(10, new Calculator().getProd(5, 2));
	}
	
	@Test
	public void test4() {
		assertEquals(25, new Calculator().getProd(5, 5));
	}

}
