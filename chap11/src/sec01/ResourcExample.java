package sec01;

public class ResourcExample {

	public static void main(String[] args) {
		
		Class clazz= Car.class;
		
//		String poto1 = clazz.getResource("������2.jpg").getPath();
		String poto2 = clazz.getResource("�ٿ�ε�.jpg").getPath();
		
		System.out.println(poto2);
		
		
		
		

	}

}
