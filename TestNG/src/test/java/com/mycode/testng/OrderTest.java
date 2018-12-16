package com.mycode.testng;


import org.testng.annotations.Test;

@SuppressWarnings({"javadoc","nls"})
public class OrderTest {
	
  @Test
  public void B(){
	  System.out.println("B");
  }
  
  @Test
  public void A(){
	  System.out.println("A");
  }
  
  @Test
  public void C(){
	  System.out.println("C");
  }
  

}
