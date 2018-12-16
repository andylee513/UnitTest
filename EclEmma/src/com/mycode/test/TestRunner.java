package com.mycode.test;

import org.junit.Ignore;
import org.junit.Test;

import com.mycode.runner.Runner;


@SuppressWarnings("javadoc")
public class TestRunner {

	/**
	 * Test method for {@link com.mycode.runner.Runner#valideNumber(java.lang.Integer)}.
	 */
	@Test
	public void testValideNumber() {
		Runner runner = new Runner();
		runner.valideNumber(2);
	}
	
	@Test
	public void testValideNumber2() {
		Runner runner = new Runner();
		runner.valideNumber(1);
	}
	
	@Test
	@Ignore
	public void testValideNumber3() {
		Runner runner = new Runner();
		runner.valideNumber(0);
	}
	
	@Test
	public void testValideNumber4() {
		Runner runner = new Runner();
	  // RunnerEntity entity = null;
		runner.valideNumber(0);
	}

}
