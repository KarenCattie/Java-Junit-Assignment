/*
* File name: [MyHealthData.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Assignment01]
* Date: [Oct 28, 2022]
* Professor: [Daniel]
* Purpose: use Junit to test the getBMI method from MyHealthData
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see java.lang.Object
 * @see org.junit.After
 * @see org.junit.AfterClass
 * @see org.junit.Assert
 * @see org.junit.Before
 * @see org.junit.Before
 * @see org.junit.Before
 * @see org.junit.BeforeClass
 * @see org.junit.Test
 *
 */
public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-2;//keep the accuracy of the output

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * test getBMI method from MyHealthData
	 * First test was successfully because the test method below were passed to the correct
	 * values that matches the getBMI() method from MyHealthData (please see the screen shot)
	 * Second test was fail because the I made a temporary change on getBMI() method from MyHealthData,
	 * I changed the division / to subtraction -, so that the calculation is wrong (please see the screen shot)
	 * 
	 */
	@Test
	public void testGetBMI() {
		MyHealthData test = new MyHealthData(null, null, null, 0, 0, 0, 0);
		double weight = 154;
		double height = 66;
		test.setWeight(weight);
		test.setHeight(height);
		double expectedResult = 24.85;
		double actualResult = test.getBMI();
		Assert.assertEquals(expectedResult, actualResult, EPSILON);
	}

}
