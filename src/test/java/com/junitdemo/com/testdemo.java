package com.junitdemo.com;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;




public class testdemo extends TestCase{
	
	
	 @Test
	   public void testAdd11() {
	      //count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	      String name = this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName = this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	      
	      
	      System.out.println();
	   }
	
	
	@Test
	public void testAdd()
	{
	System.out.println("Test1");
		
	}
	
	
	
	
}
