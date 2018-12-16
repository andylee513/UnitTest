package com.mycode.test;

import org.junit.Test;

import com.mycode.runner.Runner;

@SuppressWarnings({"javadoc","nls"})
public class TestRunner2 {

	/**
	 * Test method for {@link com.mycode.runner.Runner#valideString(java.lang.String)}.
	 */
	@Test
	public void testValideString() {
		Runner runner = new Runner();
		runner.valideString("a");
		runner.valideString("b");
	}

}
