/*
 *  Nathaniel Troksa
 *  ID: 1212853289
 * CSE360 assignment 2
 * This program is a formatted version of the provided file 
 * The program provides the basic functions of a calculator
 */


package cse360assign2;

public class Calculator {

	private int total;
	private String history = "";
	
	//Constructor of the calculator class
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history += "0";
	}
	
	//gets the total
	public int getTotal () {
		return total;
	}
	
	//adds to the total variable
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	//subtracts from the total variable
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	//multiplies the total variable
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	
	//divides the total variable
	public void divide (int value) {
		total /= value;
		history += " / " + value;
	}
	
	//returns the history of the calculators functions
	public String getHistory () {
		return history;
	}
}
