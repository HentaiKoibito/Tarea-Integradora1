package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GoldenHouse implements Serializable  {

private static final long serialVersionUID = 1L;
private ArrayList<Products> productsList;
private ArrayList<Products> productsEnabled;
private ArrayList<String> typesAmount;
private ArrayList<String> typesEnabled;
private ArrayList<String> ingredients;
private ArrayList<String> ingredientsEnabled;
private ArrayList<Client> clients;
private ArrayList<User> users;
private ArrayList<Order> orders;
private ArrayList<String> codeAmount;
private ArrayList<LocalDateTime> dates;
private final static String PRODUCTS_SAVE_PATH_FILE="data/products.muc";
private final static String PRODUCTSENABLED_SAVE_PATH_FILE="data/ProductsEnabled.muc";
private final static String ORDER_SAVE_PATH_FILE="data/Order.muc";
private final static String USER_SAVE_PATH_FILE="data/User.muc";
private final static String CLIENT_SAVE_PATH_FILE="data/Client.muc";
private final static String INGREDIENTS_SAVE_PATH_FILE="data/Ingredients.muc";
private final static String INGREDIENTSENABLED_SAVE_PATH_FILE="data/IngredientsEnabled.muc";
private final static String TYPESENABLED_SAVE_PATH_FILE="data/TypesEnabled.muc";
private final static String TYPES_SAVE_PATH_FILE="data/Types.muc";
private final static String CODES_SAVE_PATH_FILE="data/Codes.muc";
private final static String DATES_SAVE_PATH_FILE="data/Dates.muc";




	public GoldenHouse() {
		
		productsList=new ArrayList<Products>();
		productsEnabled=productsList;
		typesAmount=new ArrayList<String>();
		typesEnabled=typesAmount;
		ingredients=new ArrayList<String>();
		ingredientsEnabled= ingredients;
		clients=new ArrayList<Client>();
		users=new ArrayList<User>();
		codeAmount=new ArrayList<String>();
		dates=new ArrayList<LocalDateTime>();
	
		 
	}
	//Serializaci�n
	
	public void saveProductsData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(PRODUCTS_SAVE_PATH_FILE));
		writer.writeObject(productsList);
		writer.close();
	}
	@SuppressWarnings("unchecked")
	public boolean loadProductsData() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(PRODUCTS_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			productsList=(ArrayList<Products>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveProductsEnabledData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(PRODUCTSENABLED_SAVE_PATH_FILE));
		writer.writeObject(productsEnabled);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadProductsEnabledData() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(PRODUCTSENABLED_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			productsEnabled=(ArrayList<Products>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveOrdersData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(ORDER_SAVE_PATH_FILE));
		writer.writeObject(orders);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadOrders() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(ORDER_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			orders=(ArrayList<Order>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveUserData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(USER_SAVE_PATH_FILE));
		writer.writeObject(users);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadUsers() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(USER_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			users=(ArrayList<User>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveClientData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(CLIENT_SAVE_PATH_FILE));
		writer.writeObject(clients);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadClient() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(CLIENT_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			clients=(ArrayList<Client>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveIngredientData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(INGREDIENTS_SAVE_PATH_FILE));
		writer.writeObject(ingredients);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadIngredients() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(INGREDIENTS_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			ingredients=(ArrayList<String>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveIngredientEnabledData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(INGREDIENTSENABLED_SAVE_PATH_FILE));
		writer.writeObject(ingredientsEnabled);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadIngredientsEnabled() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(INGREDIENTSENABLED_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			ingredientsEnabled=(ArrayList<String>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveTypesEnabledData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(TYPESENABLED_SAVE_PATH_FILE));
		writer.writeObject(typesEnabled);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadTypesEnabled() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(TYPESENABLED_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			typesEnabled=(ArrayList<String>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveTypesData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(TYPES_SAVE_PATH_FILE));
		writer.writeObject(typesAmount);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadTypes() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(TYPES_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			typesAmount=(ArrayList<String>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveCodesData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(CODES_SAVE_PATH_FILE));
		writer.writeObject(codeAmount);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadCodes() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(CODES_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			codeAmount=(ArrayList<String>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	public void saveDatesData() throws FileNotFoundException, IOException {
		ObjectOutputStream writer= new ObjectOutputStream(new FileOutputStream(DATES_SAVE_PATH_FILE));
		writer.writeObject(dates);
		writer.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadDates() throws FileNotFoundException, IOException, ClassNotFoundException {
		File a= new File(DATES_SAVE_PATH_FILE);
		boolean loaded=false;
		if(a.exists()) {
			ObjectInputStream reader=new ObjectInputStream(new FileInputStream(a));
			dates=(ArrayList<LocalDateTime>)reader.readObject();
			reader.close();
			loaded=true;
		}
		return loaded;
	}
	
	
	//Productos
	public boolean createProduct(String name, String type, String[] ingredients, String size, double price, boolean state) throws FileNotFoundException, IOException {
		Products productsTemp=new Products(name, type, ingredients, size, price, state);
		if(productsList.isEmpty()) {
			productsList.add(productsTemp);
			saveProductsData();
			return true;
		}
		if(productsList.add(productsTemp)) {
			if(productsList.size()>1) {
				sortProducts(productsList);
			}
			saveProductsData();
			return true;
		}
		return false;
	}
	
	//Creo un type para los productos
	public boolean createType(String name) throws FileNotFoundException, IOException {
		if(typesAmount.isEmpty()) {
			typesAmount.add(name);
			saveTypesData();
			return true;
		}
		for(int i=0;i<typesAmount.size();i++) {
			if(name.equalsIgnoreCase(typesAmount.get(i))) {
				return false;
			}
			else {
				typesAmount.add(name);
				saveTypesData();
				return true;
			}
		}
		return false;
	}
	//Se escoge el tipo que se le va a pasar al constructor
	//metodo para la Ui de esta forma se valida si el tipo s� existe
	
	public boolean chooseTypeToAProduct(String type) {
		for(int i=0;i<typesAmount.size();i++){
			if(type.equalsIgnoreCase(typesAmount.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean createIngredient(String ingredient) throws FileNotFoundException, IOException {
		if(ingredients.isEmpty()) {
			ingredients.add(ingredient);
			saveIngredientData();
			return true;
		}
		for(int i=0;i<ingredients.size();i++) {
			if(ingredient.equalsIgnoreCase(ingredients.get(i))) {
				return false;
			}
			else {
				ingredients.add(ingredient);
				saveIngredientData();
				return true;
			}
		}
		
		return false;
	}
	//El metodo que acompa�a a este para la UI debe poder tomar el n�mero de ingredientes que el usuario seleccione
	//Cree un array String de ese tama�o
	//y tome el nombre de cada uno de los campos y se los agregue al array String en desorden.
	//De esta forma se le escoger� un String[] para el producto indicado.
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

	
	
	
	public boolean deleteProduct(String name) throws FileNotFoundException, IOException {
		for(int i=0; i<productsList.size();i++) {
			for(int j=0;j<productsEnabled.size();j++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.remove(i);
				saveProductsData();
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())){
					productsEnabled.remove(j);
					saveProductsEnabledData();
				}
				return true;
			}
		}
	}
		return false;
}
	
	public boolean deleteType(String type) throws FileNotFoundException, IOException {
		for(int i=0;i<productsList.size();i++) {
			if(!(type.equalsIgnoreCase(productsList.get(i).getType()))) {
				for(int j=0;j<typesAmount.size();j++) {
					if(type.equalsIgnoreCase(typesAmount.get(j))) {
						typesAmount.remove(j);
						saveTypesData();
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean deleteIngredients(String ingredient) throws FileNotFoundException, IOException {
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
					saveIngredientData();
					for(int j=0;j<ingredientsEnabled.size();j++) {
						if(ingredients.get(i).equalsIgnoreCase(ingredientsEnabled.get(j))) {
							ingredientsEnabled.remove(j);
							saveIngredientEnabledData();
						}
					}
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public boolean disableProduct(String name) throws FileNotFoundException, IOException {
		
		for(int i=0; i<productsList.size();i++) {
			productsEnabled.add(i,productsList.get(i));
		}
		saveProductsEnabledData();
		//Relleno productsEnabled
		
		for(int i=0;i<productsList.size();i++) {
				if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
					productsList.get(i).setState(false);
					productsEnabled.remove(i);
					saveProductsEnabledData();
					saveProductsData();
					return true;
			}
		}
		return false;
	}
	
	public boolean disableType(String type) throws FileNotFoundException, IOException {
		for(int i=0; i<typesAmount.size();i++) {
			typesEnabled.add(i,typesAmount.get(i));
			saveTypesEnabledData();
		}
		//Relleno typesEnabled
		
		for(int i=0;i<typesAmount.size();i++) {
				if(type.equalsIgnoreCase(typesEnabled.get(i))){
					typesEnabled.remove(i);
					saveTypesEnabledData();
					return true;
			}
		}
		return false;
	}

	public boolean disableIngredients(String ingredient) throws FileNotFoundException, IOException {
		for(int i=0; i<ingredients.size();i++) {
			ingredientsEnabled.add(i,ingredients.get(i));
		}
		saveIngredientEnabledData();
		//Relleno ingredientsEnabled
		
		for(int i=0;i<ingredients.size();i++) {
				if(ingredient.equalsIgnoreCase(ingredientsEnabled.get(i))){
					ingredientsEnabled.remove(i);
					saveIngredientEnabledData();
					return true;
			}
		}
		return false;
	}
	
	//Todos los update requieren el nombre del producto para as� mismo buscarlo
	public boolean updateNameProducts(String finalName, String name) throws FileNotFoundException, IOException{	
		for(int i=0;i<productsEnabled.size();i++) {
			if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
				productsEnabled.get(i).setName(finalName);
				for(int j=0;j<productsList.size();j++) {
					if(productsEnabled.get(i).getName().equalsIgnoreCase(productsList.get(j).getName())) {
						productsList.get(j).setName(finalName);
					}
					saveProductsData();
					saveProductsEnabledData();
				return true;
				}
			}
		}
		return false;
}		
	
	public boolean updateTypeProducts(String name, String finalType) throws FileNotFoundException, IOException {
		for(int i=0;i<productsEnabled.size();i++) {
			if(name.equalsIgnoreCase(productsEnabled.get(i).getName())) {
				if(chooseTypeToAProduct(finalType)) {
					productsEnabled.get(i).setType(finalType);
					for(int j=0;j<productsList.size();j++) {
						if(productsEnabled.get(i).getName().equalsIgnoreCase(productsList.get(j).getName())) {
							productsList.get(j).setType(finalType);
						}
					}
					saveProductsData();
					saveProductsEnabledData();
					return true;
				}
			}
		}
		return false;
	}
	
	//Para actualizar los ingredientes de un producto ser� necesario 
	//Crear una interfaz la cual le permita al usuario dar click en los nuevos ingredientes
	public boolean updateIngredients(String name, String[] newIngredients) throws FileNotFoundException, IOException {
		for(int i=0; i<productsList.size();i++) {
		if(name.equalsIgnoreCase(productsList.get(i).getName())) {
			productsList.get(i).setIngredients(chooseIngredientToAProduct(newIngredients));
			for(int j=0;j<productsEnabled.size();j++) {
			if(name.equalsIgnoreCase(productsEnabled.get(j).getName())) {
				productsEnabled.get(j).setIngredients(chooseIngredientToAProduct(newIngredients));
				saveProductsEnabledData();
				saveProductsData();
				return true;
			}
		}
		}
		
	}
		return false;
}
	
	public boolean updateSize(String name, String newSize) throws FileNotFoundException, IOException {
		for(int i=0; i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setSize(newSize);
				for(int j=0;j<productsEnabled.size();j++) {
				if(name.equalsIgnoreCase(productsEnabled.get(j).getName())){
					productsEnabled.get(j).setSize(newSize);
				}
				}
				saveProductsData();
				saveProductsEnabledData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updatePrice(String name, double newPrice) throws FileNotFoundException, IOException {
		for(int i=0;i<productsList.size();i++) {
			if(name.equalsIgnoreCase(productsList.get(i).getName())) {
				productsList.get(i).setPrice(newPrice);
				for(int j=0;j<productsEnabled.size();j++) {
				if(name.equalsIgnoreCase(productsEnabled.get(j).getName())) {
					productsEnabled.get(j).setPrice(newPrice);
				}
				}
				saveProductsData();
				saveProductsEnabledData();
				return true;
			}
		}
		return false;
	}
	
	//Aqui empiezo a trabajar con clientes, usuarios, empleados
	
	public boolean addClient(String name, String lastName, String identification, String advices, String phoneNumber, String address) throws FileNotFoundException, IOException{
		if(clients.isEmpty()) {
			clients.add(new Client(name, lastName, identification, advices, phoneNumber, address));
			saveClientData();
			return true;
		}
		for(int i=0;i<clients.size();i++) {
			if(!(name.equalsIgnoreCase(clients.get(i).getName()))){
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.add(new Client(name, lastName, identification, advices, phoneNumber, address));
				sortPerson(clients);
				saveClientData();
				return true;
				}
			}
		}
		return false;
	}
	
	public boolean updateClientName(String name, String lastName, String finalName) throws FileNotFoundException, IOException {
		for(int i=0; i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setName(finalName);
				saveClientData();
				return true;
				}
			}
				
		}
		return false;
	}
	
	public boolean updateClientLastName(String name, String lastName, String finalLastName) throws FileNotFoundException, IOException {
		for(int i=0; i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setLastName(finalLastName);
				saveClientData();
				return true;
				}
			}
				
		}
		return false;
	}
	
	public boolean updateID(String name, String lastName, String newId) throws FileNotFoundException, IOException {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setIdentification(newId);
				saveClientData();
				return true;
				}
			}
		}
		return false;	
	}
	
	public boolean updateAdvice(String name, String lastName, String newAdvice) throws FileNotFoundException, IOException {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setAdvices(newAdvice);
				saveClientData();
				return true;
				}
			}
		}
		return false;	
	}
	
	public boolean updatePhone(String name, String lastName, String newPhone) throws FileNotFoundException, IOException {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setPhoneNumber(newPhone);
				saveClientData();
				return true;
				}
			}
		}
		return false;	
	}
	
	public boolean updateAdress(String name, String lastName, String newAdress) throws FileNotFoundException, IOException {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())) {
				if(lastName.equalsIgnoreCase(clients.get(i).getLastName())) {
				clients.get(i).setAdress(newAdress);
				saveClientData();
				return true;
				}
			}
		}
		return false;	
	}
	
	public boolean deleteClient(String name, String lastName) throws FileNotFoundException, IOException {
		for(int i=0;i<clients.size();i++) {
			if(name.equalsIgnoreCase(clients.get(i).getName())&&(lastName.equalsIgnoreCase(clients.get(i).getLastName()))) {
				clients.remove(i);
				saveClientData();
				return true;
			}
		}
		return false;
	}
	//Trabajo relacionado a los usuarios
	
	public boolean createUser(String name, String lastName, String identification, String username, String password) throws FileNotFoundException, IOException {
		if(users.isEmpty()) {
			users.add(new User(name, lastName, identification, username, password));
			saveUserData();
			return true;
		}
		for(int i=0;i<users.size();i++) {
			if((!(name.equalsIgnoreCase(users.get(i).getName())))&&(!(lastName.equalsIgnoreCase(users.get(i).getLastName())))) {
				users.add(new User(name, lastName, identification, username, password));
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUserName(String name, String lastName, String newName) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if(name.equalsIgnoreCase(users.get(i).getName())&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.get(i).setName(newName);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUserLastName(String name, String lastName, String newLastName) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if(name.equalsIgnoreCase(users.get(i).getName())&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.get(i).setLastName(newLastName);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUserID(String name, String lastName, String newID) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if(name.equalsIgnoreCase(users.get(i).getName())&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.get(i).setIdentification(newID);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUserUsername(String name, String lastName, String newUsername) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if((name.equalsIgnoreCase(users.get(i).getName()))&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.get(i).setUsername(newUsername);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean updateUserPassword(String name, String lastName, String newPassword) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if((name.equalsIgnoreCase(users.get(i).getName()))&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.get(i).setPassword(newPassword);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(String name, String lastName) throws FileNotFoundException, IOException {
		for(int i=0;i<users.size();i++) {
			if((name.equalsIgnoreCase(users.get(i).getName()))&&(lastName.equalsIgnoreCase(users.get(i).getLastName()))) {
				users.remove(i);
				saveUserData();
				return true;
			}
		}
		return false;
	}
	//Aqui empiezo a trabajar con lo relacionado a pedidos
	public boolean enterOrder(String code, String orderStatus, String observations, String name, String lastName, String identification, String currentStatus) throws FileNotFoundException, IOException {
		Order temp=new Order(code, orderStatus, observations, name, lastName, identification, currentStatus);
		if(orders.isEmpty()) {
			orders.add(temp);
			codeAmount.add(code);
			dates.add(temp.getLocalDateTime());
			saveCodesData();
			saveDatesData();
			saveOrdersData();
			return true;
		}
		for(int i=0;i<orders.size();i++) {
			if(!(code.equalsIgnoreCase(orders.get(i).getCode()))) {
				orders.add(temp);
				codeAmount.add(code);
				dates.add(temp.getLocalDateTime());
				saveCodesData();
				saveDatesData();
				saveOrdersData();
				return true;
			}
		}
		return false;
	}
	
	public boolean changeOrderState(String code, int ind) throws FileNotFoundException, IOException {
		for(int i=0;i<orders.size();i++) {
			if(code.equalsIgnoreCase(orders.get(i).getCode())) {
				orders.get(i).setCurrentStatus(ind, orders.get(i).getCurrentStatus());
				saveOrdersData();
				return true;
			}
		}
		return false;
	}
	
	public void sortPerson(ArrayList<Client> a) {
		Collections.sort(a, new NameComparator());
	}
	public void sortProducts(ArrayList<Products> a) {
		Collections.sort(a);
	}
	
	
}
