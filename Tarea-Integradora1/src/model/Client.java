package model;

public class Client extends Person {
	private String adress;
	private String phoneNumber;
	private String advices;
	
	public Client (String name, String lastName, String identification, String advices, String phoneNumber, String adress) {
		super(name, lastName, identification);
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.advices = advices; 
	}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress=adress;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
		}
		public String getAdvices() {
			return advices;
		}
		public void setAdvices(String advices) {
			this.advices=advices;
		}
		
	@Override
	public String getInformation() {
		String a="";
		a+= getName()+" "+getLastName()+" "+getIdentification()+" "+adress+" "+phoneNumber+" "+advices+" ";
		return a;
		
		
	}
		
}
