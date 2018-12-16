package com.mycode.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@SuppressWarnings({"javadoc","nls"})
public class GroupTest {
	
  @Test(groups = {"functest" , "checkintest"})
  public void testPrintMessage(){
	  System.out.println("Inside testPrintMessage()");
	  String message1 = ".com";
	  String message2 = ".com";
	  assertEquals(message1, message2);
  }
  
  @Test(groups = {"functest"})
  public void testSalutationMessage(){
	  System.out.println("Inside testSalutationMessage()");
	  String message1 = ".com";
	  String message2 = ".com";
	  assertEquals(message1, message2);
  }
  
  @Test(groups = {"checkintest"})
  public void testingExitMessage(){
	  System.out.println("Inside testExitMessage()");
	  String message1 = ".com";
	  String message2 = ".com";
	  assertEquals(message1, message2);
  }
  

}
