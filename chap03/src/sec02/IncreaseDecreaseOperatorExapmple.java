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
		z= x++; //z= �����ȴ������� x=12 ���� �����ϰ� 13
		System.out.println("z="+z); // ++�� �ڿ� �پ z�� x�� ���� �� 12���� 
		System.out.println("x="+x);// z�� ������ 12�� �����ϰ� ���Ŀ� ���� x=13
		
		System.out.println("--------------------");
		z= x++; // x= 13 ���� �� ���� z= 13 x= 14
		System.out.println("z="+z); // z�� ������ 13 x= ������ 14
		System.out.println("x="+x);// x= 14
		System.out.println("--------------------");
		z= ++x + y++;
		System.out.println("z="+z); // z++ �տ� x�� ������ 15
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
