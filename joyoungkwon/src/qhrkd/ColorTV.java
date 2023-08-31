package qhrkd;

public class ColorTV extends Tv1{
	private int cost;

	public ColorTV(int size,int cost) {
		super(size);
		this.cost = cost;
		
	}
	void printProperty() {
		
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
