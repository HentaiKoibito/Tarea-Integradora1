package model;

public class Order {
	private String code;
	private String[] condition;
	private String listOfProducts;
	private String observations;

	public Order(String code, String[] condition, String listOfProducts, String observations) {
		this.code=code;
		this.condition=condition;
		this.listOfProducts=listOfProducts;
		this.observations=observations;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String[] getCondition() {
		return condition;
	}
	public void setCondition(String[] condition) {
		this.condition = condition;
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
}
