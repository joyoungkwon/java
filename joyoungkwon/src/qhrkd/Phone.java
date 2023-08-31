package qhrkd;

public class Phone {
	private String name;
	private String phonNumber;
	
	
	Phone(String name, String phonNumber){
		this.name = name;
		this.phonNumber=phonNumber;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhonNumber() {
		return phonNumber;
	}


	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
	
}
