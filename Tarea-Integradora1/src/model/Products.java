package model;

public class Products implements Comparable<Products> {
	private String name;
	private int typesInd;
	private String[] type;
	private String[] size;
	private double price;
	public boolean state;
	private String finalType;
	private String finalSize;
	private int sizeInd;
	
	public Products (String name, String[] type, String[] size, double price, boolean state, int typesAmount, int typesInd, int sizeAmount, String finalSize, int sizeInd) {
		this.name=name;
		this.size=size;
		this.price=price;
		type=new String[typesAmount];
		finalType=type[typesInd];
		state=true;
		size=new String[sizeAmount];
		finalSize=size[sizeInd];
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String[] getType() {
		return type;
	}
	public void setType(String[] type, int typesAmount) {
		type=new String[typesAmount];
	}
	public String[] getSize() {
		return size;
	}
	public void setSize(String[] size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state=state;
	}
	
	public String getFinalType() {
		return finalType;
	}
	
	public void setFinalType(String[] type, int typeInd) {
		finalType=type[typeInd];
	}
	
	public String getFinalSize() {
		return finalSize;
	}
	
	public void setFinalSize(String[] size, int sizeInd) {
		finalSize=size[sizeInd];
		}
	@Override
	public int compareTo(Products o) {
		
		
		return (int) (price-o.price);
	}
		
	}

