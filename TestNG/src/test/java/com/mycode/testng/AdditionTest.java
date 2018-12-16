package com.mycode.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@SuppressWarnings({"javadoc","nls"})
public class AdditionTest {
	
  @Test
  public void testAddition1(){
	  Addition addition = new Addition();
	  Long result = addition.executeAddition(1L,2L);
	  assertEquals(result.toString(), "3");
  }
  
  @Test
  public void testAddition2(){
	  Addition addition = new Addition();
	  Long result = addition.executeAddition(1L,2L,3L);
	  assertEquals(result.toString(), "6");
  }
  
  @Test
  public void testAddition3(){
	  Addition addition = new Addition();
	  Long result = addition.executeAddition();
	  assertEquals(result.toString(), "0");
  }
  

}
