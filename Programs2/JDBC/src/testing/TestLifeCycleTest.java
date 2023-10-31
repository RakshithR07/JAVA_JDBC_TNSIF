package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLifeCycleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all tests");
	}

	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each tests");
	}

	@AfterEach
	void beforeEachTest() {
		System.out.println("After each tests");
	}

	@Test
	void testMethod1() {
			System.out.println("This is test method 1");
		
	}
	void testMethod2() {
		System.out.println("This is test method 2");
	
}
}
