package sec02;

public class IncreaseDecreaseOperatorExapmple {

	public static void main(String[] args) {
		int x= 10;
		int y =10;
		int z;
		
		System.out.println("--------------------");
		x++; //x11
		++x; //x12
		System.out.println("x="+x); 
		
		System.out.println("--------------------");
		y--;// y 9
		--y;//y 8
		System.out.println("y="+y);
		
		System.out.println("--------------------");
		z= x++; //z= 아직안더해져서 x=12 값을 저장하고 13
		System.out.println("z="+z); // ++가 뒤에 붙어서 z는 x의 증감 전 12저장 
		System.out.println("x="+x);// z에 증감전 12를 저장하고 그후에 증감 x=13
		
		System.out.println("--------------------");
		z= x++; // x= 13 저장 후 증감 z= 13 x= 14
		System.out.println("z="+z); // z는 증감전 13 x= 증감후 14
		System.out.println("x="+x);// x= 14
		System.out.println("--------------------");
		z= ++x + y++;
		System.out.println("z="+z); // z++ 앞에 x의 증감값 15
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
