package model;

public class User extends Person {	
	private String username;
	private String password;
	
	public User(String name, String lastName, String identification, String username, String password) {
		super(name, lastName, identification);
		this.username = username;
		this.password = password;
		}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	@Override
	public String getInformation() {
		String a="";
		a+= getName()+" "+getLastName()+" "+getIdentification()+" "+username+" "+password;
		return a;
	}
}
