package com.wellsfargo.corejava;

//Super class
public class Car {
   // variables
	private int wheels;
	private String color;
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setWheels(5);
		//setAccountBalance(20000);
		
		BMW bmw1 = new BMW();
		bmw1.setWheels(10);
	}

	public int getWheels() {
		return 4;
	}
	
	//overloading or static polymorphism
	public int getWheels(int wheel){
		return 4 + wheel;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColor() { 
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}

//Sub class
class BMW extends Car{
	
	//Override or dynamic polymorphism
	public int getWheels() {
		return 6;
	}
	
	//Override
	public String getColor(){
		return "blue";
	}
	
}

