package com.example.demo;

public class orderBean {

	private String orderDate;
	private String region;
	private String rep1;
	private String rep2;
	private String item;
	private String units;
	private String unitCost;
	private String total;

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setRep1(String rep1) {
		this.rep1 = rep1;
	}

	public void setRep2(String rep2) {
		this.rep2 = rep2;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	public String toJsonString() 
	{
		
		String pattern = "{ \"OrderDate\": \"%s\", " 
							+ "\"Region\": \"%s\", "
							+ "\"Rep1\": \"%s\", "
							+ "\"Rep2\": \"%s\", "
							+ "\"Item\": \"%s\", "
							+ "\"Units\": \"%s\", "
							+ "\"UnitCost\": \"%s\", "
							+ "\"Total\": \"%s\" } ";

		String out = String.format(pattern, this.orderDate,
											this.region,
											this.rep1,
											this.rep2,
											this.item,
											this.units,
											this.unitCost,
											this.total);
		return out;
	}
}
