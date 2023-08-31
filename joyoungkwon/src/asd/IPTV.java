package asd;

class IPTV extends ColorTV {
	String IP;

	IPTV(String IP, int size, int cost) {
		super(size, cost);
		this.IP = IP;
	}

	public void printProperty() {
	      System.out.print("IPTV аж╪р : "+IP+", ");
	      super.printProperty();
	   }
}