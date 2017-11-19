/*
* 2017-11-15 KST
* guiCalc/Calculator.java
* Cellularhacker
*/
package guiCalc;

public class Calculator {
	// Member Variables
	private double num1;
	private double num2;
	
	// Constructor
	public Calculator() {}
	
	// Setters and Getters
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}	
	
	// Member Methods
	public double sum() {
		return num1 + num2;
	}

	public double subtract() {
		return num1 - num2;
	}
	public double product() {
		return num1 * num2; 
	}
	public double divide() throws ArithmeticException {
		return num1 / num2;
	}
	public double modular() {
		return num1 % num2;
	}
}
