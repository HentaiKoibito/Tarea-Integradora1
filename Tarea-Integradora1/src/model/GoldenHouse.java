package model;

import java.util.ArrayList;
import java.util.Collections;

public class GoldenHouse {
private ArrayList<Products> productsList;
private ArrayList<Products> productsEnabled;
private int ind;
private String finalName;
private double finalPrice;
private ArrayList<String> typesAmount;
private ArrayList<String> ingredients;
private ArrayList<String> sizesAmount;



	public GoldenHouse() {
		productsList=new ArrayList<Products>();
		productsEnabled=new ArrayList<Products>();
		 typesAmount=new ArrayList<String>();
		 ingredients=new ArrayList<String>();
		 sizesAmount=new ArrayList<String>();
	}
	
	public boolean createProduct(String name, String type, String[] ingredients, String size, double price, boolean state) {
		Products productsTemp=new Products(name, type, ingredients, size, price, state);
		if(productsList.add(productsTemp)) {
			if(productsList.size()>1) {
				sortArrayList(productsList);
			}
			return true;
		}
		return false;
	}
	
	
	public boolean createType(String name) {
		for(int i=0;i<typesAmount.size();i++) {
			if(name.equalsIgnoreCase(typesAmount.get(i))) {
				return false;
			}
			else {
				typesAmount.add(name);
				return true;
			}
		}
		return false;
	}
	//Se escoge el tipo que se le va a pasar al constructor
	public boolean chooseTypeToAProduct(String type) {
		for(int i=0;i<typesAmount.size();i++){
			if(type.equalsIgnoreCase(typesAmount.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean createIngredient(String ingredient) {
		for(int i=0;i<ingredients.size();i++) {
			if(ingredient.equalsIgnoreCase(ingredients.get(i))) {
				return false;
			}
			else {
				ingredients.add(ingredient);
				return true;
			}
		}
		return false;
	}
	//El metodo que acompaña a este para la UI debe poder tomar el número de ingredientes que el usuario seleccione
	//Cree un array String de ese tamaño
	//y tome el nombre de cada uno de los campos y se los agregue al array String en desorden.
	//De esta forma se le escogerá un String[] para el producto indicado.
	public String[] chooseIngredientToAProduct(String[] ingredient) {
		String[] finalIngredient=amountIngredientToAProduct(ingredient);
		for(int i=0; i<ingredient.length;i++) {
			for(int j=0;j<ingredients.size();j++) {
				if(ingredient[i].equalsIgnoreCase(ingredients.get(j))) {
					finalIngredient[i]=ingredient[i];
				}
			}
		}
		return finalIngredient;
	}
	
	public String[] amountIngredientToAProduct(String[] ingredient) {
		int amount=0;
		for(int i=0;i<ingredient.length;i++){
			for(int j=0;j<ingredients.size();j++) {
			if(ingredient[i].equalsIgnoreCase(ingredients.get(j))) {
				amount++;	
			}
		}
	}
		String[] finalIngredients=new String[amount];
		return finalIngredients;
		
	}
	//Si se no se agrega es porque existe previamente.
	public boolean createSize(String size) {
		for(int i=0;i<sizesAmount.size();i++) {
			if(size.equalsIgnoreCase(sizesAmount.get(i))) {
				return false;
			}
			else {
				
				sizesAmount.add(size);
				return true;
			}
		}
		return false;
	}
	
	//El size que el usuario escoja se valida primero que sí exista y despues se escoge.
	public boolean chooseSizeToAProduct(String size) {
		for(int i=0;i<sizesAmount.size();i++){
			if(size.equalsIgnoreCase(sizesAmount.get(i))) {
				return true;
			}
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
	
	public boolean deleteType(String type) {
		for(int i=0;i<productsList.size();i++) {
			if(!(type.equalsIgnoreCase(productsList.get(i).getType()))) {
				for(int j=0;j<typesAmount.size();j++) {
					if(type.equalsIgnoreCase(typesAmount.get(j))) {
						typesAmount.remove(j);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean disableProduct(String name) {
		
		for(int i=0; i<productsList.size();i++) {
			productsEnabled.add(i,productsList.get(i));
		}
		//Relleno productsEnabled
		
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
				productsEnabled.get(i).setName(finalName);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateTypeProducts(String name, String finalType) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				if(chooseTypeToAProduct(finalType)) {
					productsList.get(i).setType(finalType);
					return true;
				}
			}
		}
		return false;
	}
	
	/**public boolean updateTypeAmountProducts(String name, int typeAmount, String[] type) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
						productsList.get(i).setType(type, typeAmount);
						return true;
	}
}
	return false;
		
		
	} */
	
	/**public boolean deleteType(String name, int typeAmount, String[] type) {
		int temp;
		for(int i=0;i<type.length;i++) {
			if(name.equalsIgnoreCase(type[i])) {
				type[i]=null;
			}
		}
	}*/
	
	/**public boolean updateTypeProduct(String name, String[] type, int typeInd) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setFinalType(type, typeInd);
				return true;
			}
		}
		return false;
	}*/
	
	/**public boolean updateAmountSize(String name, int sizeAmount, String[] size) {
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
	}*/
	
	
	public void sortArrayList(ArrayList<Products> a) {
		Collections.sort(a);
	}
	
	
}
