package com.wellsfargo.corejava;

//Class representing exception handling
public class ExceptionTest {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	//try, catch ,throw ,throws, finally
	public void testMethod(){
		
		// java code
		 //FileNotFoundException
		
		try{
			//File related code
		}catch(Exception e) {
			//Exception handling code
			System.out.println("File is not found");
		}
		finally {
			System.out.println("Iam finally");
			//resource cleanup
			//databaseConnection.close();
		}
	}
	
	

}
