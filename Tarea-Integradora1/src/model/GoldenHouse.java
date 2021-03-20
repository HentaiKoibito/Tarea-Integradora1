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
	
	public boolean deleteProduct(String name) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.
				
			}
		}
	}
	
	public static void bubbleSort(ArrayList<Products> a) {
	double mChange=0;
	if(a.size()>1) {
		for(int i=1; i<a.size();i++) {
			 mChange=0;
			for(int j=0;j<a.size()-i;j++) {
				if(a.get(j).getPrice()>a.get(j+1).getPrice()) {
					Products temp = a.get(j);
					Products temps= a.get(j+1);
					a.add(j,temps);
					for(int it=0;it<a.size();it++) {
						if(a.get(j).getName().equalsIgnoreCase(a.get(it).getName())) {
							a.remove(it);
						}
					}
					a.add(j+1,temp); 
					for(int it=0;it<a.size();it++) {
						if(a.get(j+1).getName().equalsIgnoreCase(a.get(it).getName())) {
							a.remove(it);
						}
					}

					mChange++;
				}
			}
			changes.add(mChange);
		
		}
	}
}
}
