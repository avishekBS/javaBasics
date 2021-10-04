package com.learning.junit5;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

/*
 * @TestInstance(Lifecycle.PER_CLASS)  
 * --> Used when you dont want junit to create new instance for each method
 * --> When using this no need to add static for @BeforeAll &  @AfterAll
 * --> Used mostly for native test cases where we manipulate the member variable
 * --> manipulation of member variable is not possible as Test case doesnt runs as a series
 */

/*
 * @TestInstance(Lifecycle.PER_METHOD)
 * --> By default used if not mentioned
 */

class EmployeeTest {
	
	Employee employee;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("BEFORE ALL METHODS...METHOD HAS TO BE STATIC\n\n");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("\n\nAFTER ALL METHODS...METHOD HAS TO BE STATIC");
	}
	
	@BeforeEach
	void beforeEachInit(TestInfo testInfo, TestReporter testReporter) { // before each test method it will run
		System.out.println("Before Each method annotation runs...");
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		employee = new Employee();
		this.testReporter.publishEntry("test info configured for test "+testInfo.getDisplayName());
	}
	@AfterEach
	void afterEachDestroy() { // After each test method it will run
		System.out.println("After Each method annotation runs\n");
	}
	
	@Test
	@Tag("Employee")
	@DisplayName("Method to find Employee variable salary")
	void testemployeeVariableSalary() {
		System.out.println("---->>Test method testemployeeVariableSalary() run<<----");
		double actualEmployeeSalary = employee.employeeVariableSalary(100);
		double expectedEmployeeSalary = 10.0;
		assertEquals(expectedEmployeeSalary, actualEmployeeSalary, "Test to check Employee Variable salary");
	}

	@Test
	@Tag("Employee")
	@DisplayName("Method to find Employee Total salary")
	void testEmployeeTotalSalary() {
		System.out.println("---->>Test method testEmployeeTotalSalary() run<<----");
		assertEquals(110.0, employee.employeeTotalSalary(100), "Test to check Employee Total salary");
	}
	@Test
	@DisplayName("Method demo how to handle/ test for exception")
	void testExceptionHandling() {
		System.out.println("---->>Test method testExceptionHandling() run<<----");
		assertThrows(ArithmeticException.class, () -> employee.simpleDivide(6, 0));
	}
	
	@Test
	@Disabled
	@DisplayName("Skip this test using @Disable")
	void testDisabled() {
		fail("failing this test as to test @Disable");
	}
	
	@Test
	@DisplayName("assume its true then execute test")
	void testAssume() {
		boolean isserverUp = false;
		assumeTrue(isserverUp);
		fail("failing this test as to test @Disable");
	}
	
	@Nested
	@Tag("Math")
	@DisplayName("Nested divide")
	class NestedDivide {
		
		@Test
		@DisplayName("Nested divide one")
		void testAdd1() {
			assertEquals(3, employee.simpleDivide(6, 2), () -> "Test to check simple divide");
		}
		@Test
		@DisplayName("Nested divide two")
		void testAdd2() {
			assertEquals(10, employee.simpleDivide(100, 10), () -> "Test to check simple divide");
		}
	}
	
	@Test
	@DisplayName("Lamda Nested divide")
	void lamdaNestedDivide() {
		assertAll(
				() -> assertEquals(3, employee.simpleDivide(6, 2), "Test to check simple divide"),
				() -> assertEquals(10, employee.simpleDivide(100, 10), "Test to check simple divide"),
				() -> assertThrows(ArithmeticException.class, () -> employee.simpleDivide(6, 0))
				);
	}
	
	/*
	 * Repetation steps
	 */
	@RepeatedTest(10)
	@Tag("Math")
	@DisplayName("Repeat test multiple times")
	void lamdaNestedDivide(RepetitionInfo repetitionInfo) {
		System.out.println("@RepeatedTest current stage:"+repetitionInfo.getCurrentRepetition());
		assertEquals(3, employee.simpleDivide(6, 2), () -> "Test to check simple divide");
	}
}
