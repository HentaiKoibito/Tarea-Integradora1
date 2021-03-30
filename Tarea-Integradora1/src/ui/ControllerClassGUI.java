package ui;
import model.*;

import java.awt.Label;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ControllerClassGUI {
	private GoldenHouse GH;
	public ControllerClassGUI(GoldenHouse cc){
		GH=cc;
	}
	
	public void initialize() {
		 
	    }
	

    
    @FXML
    private BorderPane BorderPane;
    
    @FXML
    private TextField usernamelogintxt;
    	
    @FXML
    private PasswordField passwordlogintxt;
    
    @FXML
   public void signinloginBtn(ActionEvent event) throws IOException {
    	String a=GH.login(usernamelogintxt.getText(), passwordlogintxt.getText());
    	if(a.equalsIgnoreCase("TRUE")) {
    	FXMLLoader LoadMainPage= new FXMLLoader(getClass().getResource("ActionSelector.fxml"));
    	LoadMainPage.setController(this);
    	Parent MainPage = LoadMainPage.load();
    	BorderPane.getChildren().setAll(MainPage);
    	message.setText("Done");
    	}
    	else {
    		if(a.equalsIgnoreCase("Contraseña incorrecta")) {
    			message.setText("Contraseña incorrecta vuelve a intentar");
    			
    		}
    		if(a.equalsIgnoreCase("false")||a.equalsIgnoreCase("Usuario incorrecto, registrese o intentelo de nuevo")) {
    			message.setText("Usuario incorrecto, registrese o intentelo de nuevo");
    		}
    		
    	}
    	
    }
    
    @FXML
    private TextField lastNameUsertxt;

    @FXML
    private TextField idUsertxt;

    @FXML
    private TextField usernameUsertxt;

    @FXML
    private TextField passwordUsertxt;

    @FXML
    private TextField repasswordUsertxt;

    @FXML
    private TextField nameUsertxt;
    
    
    @FXML
    void registerbtn(ActionEvent event) throws FileNotFoundException, IOException {
    	if(passwordUsertxt.getText().equalsIgnoreCase(repasswordUsertxt.getText())) {
        	GH.createUser(nameUsertxt.getText(), lastNameUsertxt.getText(), idUsertxt.getText(), usernameUsertxt.getText(), passwordUsertxt.getText());
        	GH.saveUserData();
        	FXMLLoader LoadLoginUserPage= new FXMLLoader(getClass().getResource("Login.fxml"));
        	LoadLoginUserPage.setController(this);
        	Parent loginPane = LoadLoginUserPage.load();
        	BorderPane.getChildren().setAll(loginPane);
        	}
    }
    
    @FXML
    void turnbackbtn(ActionEvent event) throws IOException {
    	FXMLLoader LoadLoginUserPage= new FXMLLoader(getClass().getResource("Login.fxml"));
    	LoadLoginUserPage.setController(this);
    	Parent loginPane = LoadLoginUserPage.load();
    	BorderPane.getChildren().setAll(loginPane);
    }

    @FXML
    void signuploginBtn(ActionEvent event) throws IOException {
    	FXMLLoader LoadRegisterUserPage= new FXMLLoader(getClass().getResource("RegisterUser.fxml"));
    	LoadRegisterUserPage.setController(this);
    	Parent registerPane = LoadRegisterUserPage.load();
    	BorderPane.getChildren().setAll(registerPane);
    }
    
    @FXML
    private Label message;

    @FXML
    void generarCsvEmpleados(ActionEvent event) {

    }

    @FXML
    void generarCsvOrdenes(ActionEvent event) {

    }

    @FXML
    void generarCsvProductos(ActionEvent event) {

    }

    @FXML
    void generarCsvTipoDeSeparador(ActionEvent event) {

    }

    @FXML
    void generarFormularioIngredientes(ActionEvent event) {

    }

    @FXML
    void generarFormulariosClientes(ActionEvent event) {

    }

    @FXML
    void generarFormulariosEmpleados(ActionEvent event) {

    }

    @FXML
    void generarFormulariosOrdenes(ActionEvent event) {

    }

    @FXML
    void generarFormulariosProductos(ActionEvent event) {

    }

    @FXML
    void generarFormulariosUsuarios(ActionEvent event) {

    }

    @FXML
    void gestionarActualizarIngredientes(ActionEvent event) throws IOException {
    	FXMLLoader a= new FXMLLoader(getClass().getResource("IngredientsUpdate.fxml"));
    	a.setController(this);
    	Parent b= a.load();
    	BorderPane.getChildren().setAll(b);
    }
    

    @FXML
    private TableView<String> ingredientsTbv;

    @FXML
    private TableColumn<ObservableList<String>, String> ingredientsCol1tbv;

    @FXML
    private TextField ingredientNametxt;

    @FXML
    private TextField newIngredientNametxt;

    @SuppressWarnings("unchecked")
	@FXML
    void ingredientsTbvStart(ActionEvent event) {
    	ObservableList<String> ingredients=FXCollections.observableArrayList();
    	ingredients=(ObservableList<String>) GH.getIngredients();
    	ingredientsTbv.setItems(ingredients);
    	
    }
    
    @FXML
    void ActualizarIngredientesbtn(ActionEvent event) throws FileNotFoundException, IOException {
    	if(GH.updateIngredients(ingredientNametxt.getText(), newIngredientNametxt.getText())) {
    		GH.saveIngredientData();
    		GH.saveIngredientEnabledData();
    		
    	}
    }

    @FXML
    void gestionarActualizarTipo(ActionEvent event) {
    	
    }

    @FXML
    void gestionarAñadirIngredientes(ActionEvent event) throws IOException {
    	FXMLLoader a= new FXMLLoader(getClass().getResource("IngredientsCreator.fxml"));
    	a.setController(this);
    	Parent b= a.load();
    	BorderPane.getChildren().setAll(b);
    }
    @FXML
    private TableView<String> ingredientsCreateTbv;

    @FXML
    private TableColumn<ObservableList<String>, String> ingredientsCreateCol1tbv;

    @FXML
    private TextField ingredientCreatorNametxt;

    @FXML
    void CrearIngredientesbtn(ActionEvent event) throws FileNotFoundException, IOException {
    	if(GH.createIngredient(ingredientCreatorNametxt.getText())) {
    		GH.saveIngredientData();
    		GH.saveIngredientEnabledData();
    	}
    	
    }

    @FXML
    void VolverIngredientesCreatorbtn(ActionEvent event) throws IOException {
    	FXMLLoader a= new FXMLLoader(getClass().getResource("ActionSelector.fxml"));
    	a.setController(this);
    	Parent b= a.load();
    	BorderPane.getChildren().setAll(b);
    }

    @SuppressWarnings("unchecked")
	@FXML
    void ingredientsCreateTbvStart(ActionEvent event) {
    	ObservableList<String> ingredients=FXCollections.observableArrayList();
    	ingredients=(ObservableList<String>) GH.getIngredients();
    	ingredientsCreateTbv.setItems(ingredients);
    }

    @FXML
    void gestionarAñadirUsuarios(ActionEvent event) {

    }

    @FXML
    void gestionarClientes(ActionEvent event) {

    }

    @FXML
    void gestionarDeshabilitarIngredientes(ActionEvent event) throws IOException {
    	FXMLLoader a= new FXMLLoader(getClass().getResource("IngredientsDisabler.fxml"));
    	a.setController(this);
    	Parent b= a.load();
    	BorderPane.getChildren().setAll(b);
    }
    
    @FXML
    private TableView<String> ingredientsDisableTbv;

    @FXML
    private TableColumn<ObservableList<String>, String> ingredientsDisableCol1tbv;

    @FXML
    private TextField ingredientDisablerNametxt;

    @FXML
    void CrearIngredientesDisablebtn(ActionEvent event) throws FileNotFoundException, IOException {
    	if(GH.disableIngredients(ingredientDisablerNametxt.getText())) {
    		GH.saveIngredientData();
    		GH.saveIngredientEnabledData();
    	}
    }

    @FXML
    void VolverIngredientesDisablebtn(ActionEvent event) {

    }

    @FXML
    void ingredientsDisableTbvStart(ActionEvent event) {

    }

    @FXML
    void gestionarDeshabilitarTipo(ActionEvent event) {

    }

    @FXML
    void gestionarEliminarProductos(ActionEvent event) {

    }

    @FXML
    void gestionarEliminarUsuarios(ActionEvent event) {

    }

    @FXML
    void gestionarEliminatIngredientes(ActionEvent event) throws IOException {
    	FXMLLoader a= new FXMLLoader(getClass().getResource("IngredientsDeleter.fxml"));
    	a.setController(this);
    	Parent b= a.load();
    	BorderPane.getChildren().setAll(b);
    }
    
    @FXML
    private TableView<String> ingredientsDeletingTbv;

    @FXML
    private TableColumn<ObservableList<String>, String> ingredientsDeleteCol1tbv;

    @FXML
    private TextField ingredientDeleteNametxt;

 

    @FXML
    void EliminarIngredientesbtn(ActionEvent event) throws FileNotFoundException, IOException {
    	if(GH.deleteIngredients(ingredientDeleteNametxt.getText())) {
    		GH.saveIngredientData();
    		GH.saveIngredientEnabledData();
    	}
    }

    @SuppressWarnings("unchecked")
	@FXML
    void ingredientsDeletingTbvStart(ActionEvent event) {
    	ObservableList<String> ingredients=FXCollections.observableArrayList();
    	ingredients=(ObservableList<String>) GH.getIngredients();
    	ingredientsDeletingTbv.setItems(ingredients);
    }

    @FXML
    void gestionarTipoEliminar(ActionEvent event) {

    }

    @FXML
    void gestionarTipoañadir(ActionEvent event) {

    }

    @FXML
    void gestionarUsuarios(ActionEvent event) {

    }

    @FXML
    void gestionaractualizarProductos(ActionEvent event) {

    }

    @FXML
    void gestionaractualizarclientes(ActionEvent event) {

    }

    @FXML
    void gestionaractualizarusuarios(ActionEvent event) {

    }

    @FXML
    void gestionarañadirClientes(ActionEvent event) {

    }

    @FXML
    void gestionarañadirProductos(ActionEvent event) {

    }

    @FXML
    void gestionardeshabilitarproductos(ActionEvent event) {

    }

    @FXML
    void gestionareliminatclientes(ActionEvent event) {

    }

    @FXML
    void importarCsvClientes(ActionEvent event) {

    }

    @FXML
    void importarCsvPedidos(ActionEvent event) {

    }

    @FXML
    void importarCsvProductos(ActionEvent event) {

    }

    @FXML
    void listarIngredientes(ActionEvent event) {

    }

    @FXML
    void listarProductos(ActionEvent event) {

    }

    @FXML
    void registrarCambiarEstadoDePedido(ActionEvent event) {

    }

    @FXML
    void registrarPedido(ActionEvent event) {

    }
    
}
