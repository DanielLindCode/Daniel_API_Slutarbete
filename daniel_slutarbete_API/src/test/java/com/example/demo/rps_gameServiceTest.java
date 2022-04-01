package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class rps_gameServiceTest {

	private fileReaderService sut;

	@BeforeClass
	public static void setupAll()
	{
		System.out.println("Running FileReaderService tests...");
	}

	@Before
	public void setUp()
	{
		sut = new fileReaderService();
	}
	

	@Test
	public void testOperatorPlusSucsess() 
	{
		// TODO - /rps
		// TODO - /rps/play/rock
		// TODO - /rps/play/paper
		// TODO - /rps/play/scissors
		// TODO - /rps/result
	}
	

	@After
	public void tearDown() {
		// code executed after each test method
	}

	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("All tests done!");
	}

}
