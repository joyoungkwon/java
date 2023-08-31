package sec01;

public class iPhone {
	String company = "apple";
	int cost = 1500000;
	String model = "iPhone14Max";

	public iPhone(String company, int cost, String model) {
		super();
		this.company = company;
		this.cost = cost;
		this.model = model;
	}

	@Override
	public String toString() {
		return company  +  model  +  "가격은"  +  cost  +  "입니다" ;

	}

}
