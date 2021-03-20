package model;

public class Products {
	private String name;
	private String[] type;
	private String[] size;
	private double price;
	private int typesAmount;
	
	public Products (String name, String[] type, String[] size, double price) {
		this.name=name;
		this.type=type;
		this.size=size;
		this.price=price;
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
	public void serType(String[] type) {
		this.type=type;
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
	

		
	}

