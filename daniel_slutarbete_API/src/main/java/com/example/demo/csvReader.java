package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;

public class csvReader {
	
	public orderBean procesLine(String textLine)
	{
		orderBean ob = new orderBean();
		String[] columns = textLine.split(",");
		ob.setOrderDate(columns[0]);
		ob.setRegion(columns[1]);
		ob.setRep1(columns[2]);
		ob.setRep2(columns[3]);
		ob.setItem(columns[4]);
		ob.setUnits(columns[5]);
		ob.setUnitCost(columns[6]);
		ob.setTotal(columns[7]);
		
		return ob;
	}
	
	public ArrayList<orderBean> readFile(String fileName) throws FileNotFoundException, IOException
	{
		ArrayList<orderBean> orders = new ArrayList<orderBean>();
		
		var csvFile = new ClassPathResource(fileName);
				
		Scanner myScanner = new Scanner(csvFile.getFile());
		
		while(myScanner.hasNextLine())
		{
			String textline = myScanner.nextLine();
			orderBean oneOrder = procesLine(textline);
			orders.add(oneOrder);
		}
	
		return orders;
	}
}
