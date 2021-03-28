package model;

import java.util.ArrayList;

public class Order {
	private String code;
	private String orderStatus;
	private String listOfProducts;
	private String observations;
	private ArrayList<Products> orderProducts;
	private int[] amountPerProducts;
	private Employee orderEmployee;
	private String[] statusOrder={"SOLICITADO", "ENPROCESO", "ENVIADO", "ENTREGADO"};
	private String currentStatus;
	
	public Order(String code, String orderStatus, String observations, String name, String lastName, String identification, String currentStatus) {
		this.code=code;
		this.orderStatus=orderStatus;
		this.observations=observations;
		orderProducts=new ArrayList<Products>();
		amountPerProducts=new int[orderProducts.size()];
		orderEmployee=new Employee(name, lastName, identification);
		this.currentStatus=currentStatus;
		
	}
	public String getCode() {
		return code;
	}

	public void setCode() {
		code=(int)Math.random()*99999+"";
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setCondition(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(String listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public int[] getAmountPerProducts() {
		return amountPerProducts;
	}
	//recordar que la cantidad por producto se va a llenar al momento en que trabajemos con la interfaz
	//La interfaz va a retornar una cantidad por cada producto y esta se va a guardar en el array
	public void setAmountPerProducts(int[] amountPerProduct) {
		amountPerProduct=new int[orderProducts.size()];
	}
	public ArrayList<Products> getProducts(){
		return orderProducts;
	}
	//Igualmente los products tomaras
	public void setOrderProducts(ArrayList<Products> orderProducts) {
		this.orderProducts=orderProducts;
	}
	public Employee getOrderEmployee() {
		return orderEmployee;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(int indicator) {
		switch(indicator) {
		
		case 1: 
			currentStatus=statusOrder[0];
			break;
		case 2:
			currentStatus=statusOrder[1];
			break;
		case 3: 
			currentStatus=statusOrder[2];
			break;
		case 4:
			currentStatus=statusOrder[3];
			break;
		}
	}
}
