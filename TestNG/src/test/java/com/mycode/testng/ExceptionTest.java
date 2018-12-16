package com.mycode.testng;



import org.testng.annotations.Test;

@SuppressWarnings({"javadoc"})
public class ExceptionTest {
	
  @Test(expectedExceptions = ArithmeticException.class)
  public void testException(){
	  int b = 1/0;
	  System.out.println(b);
  } 

}
