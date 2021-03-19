package model;

public class Employee extends Person {

	public Employee(String name, String lastName, String identification) {
		super(name, lastName, identification);
		
	}

	@Override
	public String getInformation() {
		String a="";
		a+= getName()+" "+getLastName()+" "+getIdentification();
		return a;
	}

}
