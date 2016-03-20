package com.array.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayDimensionTest {

	private ArrayDimension dimension;
	
	@Before
	public void setUp(){
		dimension = new ArrayDimension();
	}
	
	@Test
	public void testFindNearestDimension(){
		assertSame(dimension.findNearestDimension(3), 2);
		assertSame(dimension.findNearestDimension(37), 7);
	}
	
	@Test
	public void testFindNearestDimension2(){
		assertNotSame(dimension.findNearestDimension(-12), 4);
	}
	
	@Test(expected = NullPointerException.class)
	public void testDivideArrayNull() {
		Object [][] finalArray = dimension.divideArray(null, dimension.findNearestDimension(0));
		assertSame(finalArray.length, 0);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDivideArrayEmpty() {
		String [] array = {};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertNotNull(finalArray[0][1]);
	}
	
	@Test
	public void testDivideArray() {
		String [] array = {};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 0);
	}
	
	@Test
	public void testDivideArray1() {
		String [] array = {"A"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 1);
	}
	
	@Test
	public void testDivideArray2() {
		String [] array = {"A","B"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 2);
		assertNull(finalArray[1]);
	}
	
	@Test
	public void testDivideArray3() {
		String [] array = {"A","B","C"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 2);
		assertSame(finalArray[1][0], "C");
		assertSame(finalArray[1].length, 1);
	}
	
	@Test
	public void testDivideArray4() {
		String [] array = {"A","B","C","D"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 2);
		assertSame(finalArray[1].length, 2);
	}

	@Test
	public void testDivideArray5() {
		String [] array = {"A","B","C","D","E"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertSame(finalArray.length, 3);
		assertSame(finalArray[1].length, 2);
		assertNull(finalArray[2]);
	}
	
	@Test
	public void testDivideArray6() {
		String [] array = {"A", null, "B", null, "C", null, "D"};
		Object [][] finalArray = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		assertNotNull(finalArray);
		assertSame(finalArray.length, 3);
		assertSame(finalArray[1].length, 3);
		assertSame(finalArray[2].length, 1);
		assertNull(finalArray[0][1]);
	}
	
	@After
	public void tearDown(){
		dimension = null;
	}
}
