package com.mycode.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@SuppressWarnings({"javadoc","nls"})
public class MutiplyTest {
	
  @Test
  public void testMutiply1(){
	  Mutiply mutiply = new Mutiply();
	  Long result = mutiply.executeMutiply(1L,2L);
	  assertEquals(result.toString(), "2");
  }
  
  @Test
  public void testMutiply2(){
	  Mutiply mutiply = new Mutiply();
	  Long result = mutiply.executeMutiply(1L,2L,3L);
	  assertEquals(result.toString(), "6");
  }
  
  @Test
  public void testMutiply3(){
	  Mutiply mutiply = new Mutiply();
	  Long result = mutiply.executeMutiply();
	  assertEquals(result.toString(), "1");
  }

}
