package com.junitdemo.com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.*;

public class test {
	   public static void main(String[] a) {
	      // add the test's in the suite
		    // add the test's in the suite1
	      TestSuite suite = new TestSuite(testdemo.class);
	      suite.addTestSuite(test1.class);
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());
	
	   }
	

}
