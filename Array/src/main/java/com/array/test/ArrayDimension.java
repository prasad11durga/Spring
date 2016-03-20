package com.array.test;
import java.util.Arrays;

public class ArrayDimension {
	
	//Remove this comment to print hte array elements
	/*public static void main(String[] args){
		String [] array = {"A","B",null,"C",null,"D",null,"E",null,"F"};
		//Integer[] array = {1,2,null,3,4,null,5,null,6,null};
		ArrayDimension dimension = new ArrayDimension();
		Object[][] target = dimension.divideArray(array, dimension.findNearestDimension(array.length));
		dimension.printArray(target);
	}*/
	public int findNearestDimension(int number) {
		return (int) Math.sqrt(Math.ceil(Math.sqrt(number))*Math.ceil(Math.sqrt(number)));
	}
	
	public Object[][] divideArray(Object[] source , int noOfDimensions) {
		Object[][] finalArray = new Object[noOfDimensions][];
		int start=0, i=0;
		while(start < source.length) {
			finalArray[i] = Arrays.copyOfRange(source, start, Math.min(source.length , start + noOfDimensions));
			start = start + noOfDimensions;
			i++;
		}
		return finalArray;
	}
	
	//Remove the comment to print the array
	/*public void printArray(Object[][] array){
		for(Object[] object: array) {
			if(null != object)
			for(Object obj : object) {
				System.out.print("\t"+obj);
			}System.out.println();
		}
	}*/
}
