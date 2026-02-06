package com.ibm.unittesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.ibm.unittesting.Arithimetic;

class ArithimeticTest {
	
	static Arithimetic arithimetic;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arithimetic=new Arithimetic();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testSum() {
		int expected = 6;
		int actual =arithimetic.sum(2,4);
		assertEquals(expected,actual);
		//("Not yet implemented");
	}
	@ParameterizedTest
	@CsvSource({"2,3,5","0,0,0","10,-5,5"})
	void testSum(int num1,int num2,int expected) {
		assertEquals(expected,arithimetic.sum(num1,num2));
	}
//	@ParameterizedTest
//	@ValueSource(ints = {1,3,4,-3,15,Integer.MAX_VALUE})
//	void testIsOdd(int number) {
//		assertTrue(number %2 !=0);
//	}

}
