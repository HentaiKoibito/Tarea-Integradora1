package model;

import java.io.Serializable;

public class Employee extends Person implements Serializable{

	private static final long serialVersionUID = 1L;

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
