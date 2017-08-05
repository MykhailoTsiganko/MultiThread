package com.epam.lab.gmail;

import org.testng.annotations.Test;

public class ChekMulti {
	
	private volatile String str = null;
	
	
	@Test(threadPoolSize = 3,invocationCount = 3)
	public void test() {
		str = "  STR:" + System.currentTimeMillis() +"  "+ Thread.currentThread().getId();
		
		System.out.println("Thread ID:" + Thread.currentThread().getId()   + str );
	}
	
	
	

}
