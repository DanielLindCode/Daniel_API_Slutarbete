package com.example.demo;

public class calcService {	
	
	public String calculator(String op, String n1, String n2) 
	{
		int result;
		int input1 = Integer.parseInt(n1);
		int input2 = Integer.parseInt(n2);

		switch (op) {
		case "PLUS":
			result = input1 + input2;
			return Integer.toString(result);

		case "MINUS":
			result = input1 - input2;
			return Integer.toString(result);

		case "TIMES":
			result = input1 * input2;
			return Integer.toString(result);

		case "DIVIDE":
			if (input1 == 0 || input2 == 0) {result = 0;}
			else {result = input1 / input1;}
			
			return Integer.toString(result);

		default:
			return "Invalid operator!";
		}
	}
}
