package com.mycode.runner;


@SuppressWarnings({"javadoc","nls"})
public class Runner {

	public void valideNumber(Integer number){
		switch(number%3){
			case 1:
				System.out.println("余数为1");
				break;
			case 2:
				System.out.println("余数为2");
				break;
			default:
				System.out.println("其他情况");
		}
	}
	
	public boolean valideString(String str){
		return "a".equals(str) || "b".equals(str);
	}
}
