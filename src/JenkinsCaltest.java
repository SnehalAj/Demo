package com.sj.training.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCaltest {

	@Test
	public void addTest()
	{
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.addNumber(5,5));
	}
	
	@Test
	public void subtractTest()
	{
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.subtractNumber(10,5));
	}
}
