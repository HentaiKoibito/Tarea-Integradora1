package model;

import java.util.ArrayList;
import java.util.Collections;

public class GoldenHouse {
private ArrayList<Products> productsList;
private ArrayList<Products> productsEnabled;
private ArrayList<String> typesAmount;
private ArrayList<String> typesEnabled;
private ArrayList<String> ingredients;
private ArrayList<String> ingredientsEnabled;
private ArrayList<Client> clients;

	public GoldenHouse() {
		productsList=new ArrayList<Products>();
		productsEnabled=productsList;
		typesAmount=new ArrayList<String>();
		typesEnabled=typesAmount;
		ingredients=new ArrayList<String>();
		ingredientsEnabled= ingredients;
		clients=new ArrayList<Client>();
		 
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
	//metodo para la Ui de esta forma se valida si el tipo sí existe
	
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
			for(int j=0;j<ingredientsEnabled.size();j++) {
				if(ingredient[i].equalsIgnoreCase(ingredientsEnabled.get(j))) {
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

	
	
	
	public boolean deleteProduct(String name) {
		for(int i=0; i<productsList.size();i++) {
			for(int j=0;j<productsEnabled.size();j++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.remove(i);
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())){
					productsEnabled.remove(j);
				}
				return true;
			}
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
	
	public boolean deleteIngredients(String ingredient) {
		boolean temp=false;
		for(int i=0;i<productsList.size();i++) {
			for(int j=0;j<productsList.get(i).getIngredients().length;j++) {
				if(ingredient.equalsIgnoreCase(productsList.get(i).getIngredients()[j])) {
					return false;
					
				}
				else {
					temp=true;
				}
			}
		}
		if(temp=true) {
			for(int i=0; i<ingredients.size();i++) {
				if(ingredient.equalsIgnoreCase(ingredients.get(i))) {
					ingredients.remove(i);
					for(int j=0;j<ingredientsEnabled.size();j++) {
						if(ingredients.get(i).equalsIgnoreCase(ingredientsEnabled.get(j))) {
							ingredientsEnabled.remove(j);
						}
					}
					return true;
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
	
	public boolean disableType(String type) {
		for(int i=0; i<typesAmount.size();i++) {
			typesEnabled.add(i,typesAmount.get(i));
		}
		//Relleno typesEnabled
		
		for(int i=0;i<typesAmount.size();i++) {
				if(type.equalsIgnoreCase(typesEnabled.get(i))){
					typesEnabled.remove(i);
					return true;
			}
		}
		return false;
	}

	public boolean disableIngredients(String ingredient) {
		for(int i=0; i<ingredients.size();i++) {
			ingredientsEnabled.add(i,ingredients.get(i));
		}
		//Relleno ingredientsEnabled
		
		for(int i=0;i<ingredients.size();i++) {
				if(ingredient.equalsIgnoreCase(ingredientsEnabled.get(i))){
					ingredientsEnabled.remove(i);
					return true;
			}
		}
		return false;
	}
	
	//Todos los update requieren el nombre del producto para así mismo buscarlo
	public boolean updateNameProducts(String finalName, String name){	
		for(int i=0;i<productsEnabled.size();i++) {
			if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
				productsEnabled.get(i).setName(finalName);
				for(int j=0;j<productsList.size();j++) {
					if(productsEnabled.get(i).getName().equalsIgnoreCase(productsList.get(j).getName())) {
						productsList.get(j).setName(finalName);
					}
				return true;
				}
			}
		}
		return false;
}		
	
	public boolean updateTypeProducts(String name, String finalType) {
		for(int i=0;i<productsEnabled.size();i++) {
			if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
				if(chooseTypeToAProduct(finalType)) {
					productsEnabled.get(i).setType(finalType);
					for(int j=0;j<productsList.size();j++) {
						if(productsEnabled.get(i).getName().equalsIgnoreCase(productsList.get(j).getName())) {
							productsList.get(j).setType(finalType);
						}
					}
					return true;
				}
			}
		}
		return false;
	}
	
	//Para actualizar los ingredientes de un producto será necesario 
	//Crear una interfaz la cual le permita al usuario dar click en los nuevos ingredientes
	public boolean updateIngredients(String name, String[] newIngredients) {
		for(int i=0; i<productsList.size();i++) {
		if(name.equalsIgnoreCase(productsList.get(i).getName())) {
			productsList.get(i).setIngredients(chooseIngredientToAProduct(newIngredients));
			if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
				productsEnabled.get(i).setIngredients(chooseIngredientToAProduct(newIngredients));
				return true;
			}
		}
		
	}
		return false;
}
	
	public boolean updateSize(String name, String newSize) {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setSize(newSize);
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())){
					productsEnabled.get(i).setSize(newSize);
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean updatePrice(String name, double newPrice) {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setPrice(newPrice);
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
					productsEnabled.get(i).setPrice(newPrice);
				}
				return true;
			}
		}
		return false;
	}
	
	//Aqui empiezo a trabajar con clientes, usuarios, empleados
	
	public boolean addClient(String name, String lastName, String identification, String advices, String phoneNumber, String address){
		for(int i=0;i<clients.size();i++) {
			if(!(name.equalsIgnoreCase(clients.get(i).getName()))){
				clients.add(new Client(name, lastName, identification, advices, phoneNumber, address));
				return true;
			}
		}
		return false;
	}
	
	public boolean updateClientName(String name, String finalName) {
		for(int i=0; i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setName(finalName);
				return true;
			}
				
		}
		return false;
	}
	
	public boolean updateClientLastName(String name, String finalLastName) {
		for(int i=0; i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setLastName(finalLastName);
				return true;
			}
				
		}
		return false;
	}
	
	public boolean updateID(String name, String newId) {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setIdentification(newId);
				return true;
			}
		}
		return false;	
	}
	
	public boolean updateAdvice(String name, String newAdvice) {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setAdvices(newAdvice);
				return true;
			}
		}
		return false;	
	}
	
	public boolean updatePhone(String name, String newPhone) {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setPhoneNumber(newPhone);
				return true;
			}
		}
		return false;	
	}
	
	public boolean updateAdress(String name, String newAdress) {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.get(i).setAdress(newAdress);
				return true;
			}
		}
		return false;	
	}
	
	public boolean deleteClient(String name) {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				clients.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//Aqui empiezo a trabajar con lo relacionado a pedidos
	
	
	public void sortArrayList(ArrayList<Products> a) {
		Collections.sort(a);
	}
	
	
}
