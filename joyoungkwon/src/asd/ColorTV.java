package asd;

class ColorTV extends TV {
	private int cost;

	ColorTV(int size, int cost) {
		super(size);
		this.cost = cost;
	}

	public void printProperty() {
		System.out.print(getSize() + "��ġ " + cost + "����");
	}
}