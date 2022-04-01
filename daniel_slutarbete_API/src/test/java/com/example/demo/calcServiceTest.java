package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calcServiceTest {
	
	private calcService sut;

	@BeforeClass
	public static void setupAll()
	{
		System.out.println("Running calcService tests...");
	}

	@Before
	public void setUp()
	{
		sut = new calcService();
	}
	
	// Tests for the operator "PLUS"
	@Test
	void tenPlusFiveShouldBeFifteen() 
	{
		String actual = sut.calculator("PLUS", "10", "5");
		String expected = "15";
		assertEquals(actual, expected);
	}
	@Test
	void twoPlusFiveShouldNetBeNinty() 
	{
		String actual = sut.calculator("PLUS", "2", "5");
		String expected = "90";
		assertNotEquals(actual, expected);
	}
	@Test
	void onePlusSignOneShouldReturnInvalidOperator()
	{
		String actual = sut.calculator("+", "1", "1");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	void twoAsAStringPlusfiveShouldReturnNumberFormatException() 
	{
		String actual = sut.calculator( "PLUS", "two", "5");
	}

	// Tests for the operator "MINUS"
	@Test
	void twoMinusOneShouldBeOne()
	{

		String actual = sut.calculator("MINUS", "2", "1");
		String expected = "1";
		assertEquals(actual, expected);
	}
	@Test
	void fiveMinusOneShouldNotBeFourHundredFour()
	{

		String actual = sut.calculator("MINUS", "5", "1");
		String expected = "404";
		assertNotEquals(actual, expected);
	}
	@Test
	void twoMinusSignOneShouldReturnInvalidOperator()
	{

		String actual = sut.calculator("-", "2", "1");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	void TwoAsAStringMinusFiveShouldReturnNumberFormatException() 
	{
		String actual = sut.calculator("MINUS", "two", "5");
	}

	// Tests for the operator "TIMES"
	@Test
	void twoTimesTwoShouldBeFour()
	{

		String actual = sut.calculator("TIMES", "2", "2");
		String expected = "4";
		assertEquals(actual, expected);
	}
	@Test
	void twoTimesTwoShouldNotBeFourhundreadthree()
	{

		String actual = sut.calculator("TIMES", "2", "2");
		String expected = "403";
		assertNotEquals(actual, expected);
	}
	@Test
	void twoTimesSignTwoShouldReturnInvalidOperator()
	{

		String actual = sut.calculator("*", "2", "2");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	void twoAsAStringTimesTwoShouldReturnNumberFormatException() 
	{
		String actual = sut.calculator("TIMES", "two", "5");
	}

	// Tests for the operator "DIVIDE"
	@Test
	void fourDividedByTwoShouldBeTwo() 
	{
		String actual = sut.calculator("DIVIDE", "4", "2");
		String expected = "2";
		assertEquals(actual, expected);
	}
	@Test
	void FiveDividedByTwoShouldNotBeOneThousandThreehundredThirtyseven() 
	{
		String actual = sut.calculator("DIVIDE", "5", "2");
		String expected = "1337";
		assertNotEquals(actual, expected);
	}
	@Test
	void FifteenDividedByZeroShouldBeZero()
	{
		String actual = sut.calculator("DIVIDE", "15", "0");
		String expected = "0";
		assertEquals(actual, expected);		
	}
	@Test
	void FourDividedSymbolTwoShouldReturnInvalidOperator() 
	{
		String actual = sut.calculator("/", "4", "2");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	void TwoStringDividedByFiveShouldReturnNumberFormatException() 
	{
		String actual = sut.calculator("DIVIDE", "two", "5");
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
