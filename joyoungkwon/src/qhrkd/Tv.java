package qhrkd;

public class Tv {
	private String brand;
	private int year;
	private int size;
	
	public Tv(String brand, int year , int size){
		this.brand=brand;
		this.year= year;
		this.size = size;
	}
	void show(){
		System.out.println(brand+"��������"+size+"��ġ"+"tv");
		
	}
	
	public static void main(String[]args) {
		Tv tv = new Tv("�Ｚ",2023,55);
		tv.show();
	}
}
