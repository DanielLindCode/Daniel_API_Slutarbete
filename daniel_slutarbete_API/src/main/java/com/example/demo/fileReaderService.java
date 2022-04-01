package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

public class fileReaderService {
	
	orderBean myOrder = new orderBean();
		
	private ArrayList<orderBean> orders;
	
	
	public void readFile(String filename) throws IOException 
	{
	csvReader cs = new csvReader();
	orders = cs.readFile(filename);
	}
	
	public String toJson()
	{
		String result = "";
		
		for (orderBean order : orders) 
		{
			result += order.toJsonString() + ",";
		}
		if (result.length() > 2) {
			result = result.substring(0, result.length() - 1);
		}
		
		result = "{ \"CSV File\":  [" + result + "] }";
		
		return result;
	}
}
