package model;

import java.util.ArrayList;
import java.util.Collections;

public class GoldenHouse {
private ArrayList<Products> productsList;
private ArrayList<Products> productsEnabled;
private int ind;
private int typesAmount;
private int sizeAmount;
private String finalName;
private double finalPrice;
private String[] type;
private String[] size;

	public GoldenHouse() {
		productsList=new ArrayList<Products>();
		productsEnabled=new ArrayList<Products>();
	}
	
	public boolean createProduct(String name, String[] type, String[] size, double price, boolean state, int typesAmount, int typesInd, int sizeAmount,String finalSize, int sizeInd) {
		
		Products productsTemp=new Products(name, type, size, price, state, typesAmount, typesInd, sizeAmount, finalSize, sizeInd);
		if(productsList.add(productsTemp)) {
			if(productsList.size()>1) {
				sortArrayList(productsList);
			}
			return true;
		}
		return false;
	}
	
	public boolean deleteProduct(String name) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean disableProduct(String name) {
		
		for(int i=0; i<productsList.size();i++) {
			productsEnabled.add(i,productsList.get(i));
		}
		for(int i=0;i<productsList.size();i++) {
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
					productsList.get(i).setState(false);
					productsEnabled.remove(i);
					return true;
			}
		}
		return false;
	}
	
	public boolean updateNameProducts(String finalName, String name){
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setName(finalName);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateTypeAmountProducts(String name, int typeAmount, String[] type) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
						productsList.get(i).setType(type, typeAmount);
						return true;
	}
}
	return false;
		
		
	}
	
	public boolean deleteType(String name, int typeAmount, String[] type) {
		int temp;
		for(int i=0;i<type.length;i++) {
			if(name.equalsIgnoreCase(type[i])) {
				type[i]=null;
			}
		}
	}
	
	public boolean updateTypeProduct(String name, String[] type, int typeInd) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setFinalType(type, typeInd);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateAmountSize(String name, int sizeAmount, String[] size) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
						productsList.get(i).setType(size, sizeAmount);
						return true;
	}
}
	return false;
	}
	
	public boolean updateSize(String name, String[]	size, int sizeInd) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setFinalSize(size, sizeInd);
				return true;
			}
		}
		return false;
	}
	
	
	public void setTypeAmount(int typeAmount) {
		this.typesAmount=typeAmount;
	}
	public void setSizeAmount(int sizeAmount) {
		this.sizeAmount=sizeAmount;
	}
	
	public boolean updatePrice(String name, double price) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setPrice(price);
				return true;
			}
		}
		return false;
	}
	
	public
	
	//ingredients
	public void 
	
	public void sortArrayList(ArrayList<Products> a) {
		Collections.sort(a);
	}
	
	
}
