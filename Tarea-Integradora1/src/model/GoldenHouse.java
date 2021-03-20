package model;

import java.util.ArrayList;

public class GoldenHouse {
private ArrayList<Products> productsList;
private ArrayList<Products> allProducts;

	public GoldenHouse() {
		productsList=new ArrayList<Products>();
		allProducts=new ArrayList<Products>();
	}
	
	public boolean createProduct(String name, String[] type, String[] size, double price) {
		
		Products productsTemp=new Products(name, type, size, price);
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
			allProducts.add(i,productsList.get(i));
		}
		for(int i=0;i<productsList.size();i++) {
				if(name.equalsIgnoreCase(productsList.get(i).getName())) {
					productsList.remove(i);
					return true;
			}
		}
		return false;
	}
	
	public 
	
	public static void sortArrayList (ArrayList<Products> a) {
	double mChange=0;
	if(a.size()>1) {
		for(int i=1; i<a.size();i++) {
			 mChange=0;
			for(int j=0;j<a.size();j++) {
				if(a.get(j).getPrice()>a.get(j+1).getPrice()) {
					Products temp = a.get(j+1);
					Products temps= a.get(j);
					a.add(j+1,temps);
					for(int it=0;it<a.size();it++) {
						if(a.get(j+1).getName().equalsIgnoreCase(a.get(it).getName())) {
							a.remove(it);
						}
					}
					a.add(j,temp); 
					for(int it=0;it<a.size();it++) {
						if(a.get(j).getName().equalsIgnoreCase(a.get(it).getName())) {
							a.remove(it);
						}
					}

					
				}
			}
		
		}
	}
}
}
