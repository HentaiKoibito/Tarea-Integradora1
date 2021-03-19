package model;

import java.util.ArrayList;

public class GoldenHouse {
private ArrayList<Products> productsList;

	public GoldenHouse() {
		productsList=new ArrayList<Products>();
	}
	
	public boolean createProduct(String name, String[] type, String[] size, double price) {
		Products productsTemp=new Products(name, type, size, price);
		if(productsList.add(productsTemp)) {
			return true;
		}
		return false;
	}
	
	
}
