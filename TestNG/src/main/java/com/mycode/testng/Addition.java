package com.mycode.testng;

@SuppressWarnings({"javadoc"})
public class Addition {
	
	public Long executeAddition(Object... objs){
		Long result = 0L;
		if(null != objs){
			for(Object obj : objs){
				result += Long.valueOf((Long)obj);
			}
		}
		return result;
	}
}
