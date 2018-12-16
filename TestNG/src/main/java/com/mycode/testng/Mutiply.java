package com.mycode.testng;

@SuppressWarnings({"javadoc"})
public class Mutiply {

	public Long executeMutiply(Object... objs){
		Long result = 1L;
		if(null != objs){
			for(Object obj : objs){
				result *= Long.valueOf((Long)obj);
			}
		}
		return result;
	}
}
