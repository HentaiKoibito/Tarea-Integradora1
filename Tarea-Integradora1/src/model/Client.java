package model;

public class Client extends Person {
	private String adress;
	private String phoneNumbe;
	private String advices;
	
	public Client (String name, String lastName, String identification, String advices, String phoneNumbe, String adress) {
		super(name, lastName, identification);
		this.adress = adress;
		this.phoneNumbe = phoneNumbe;
		this.advices = advices; 
	}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress=adress;
		}
		public String getPhoneNumber() {
			return phoneNumbe;
		}
		public void setPhoneNumber(String phoneNumbe) {
			this.phoneNumbe=phoneNumbe;
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
