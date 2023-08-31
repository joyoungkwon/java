package sec01;

public class ResourcExample {

	public static void main(String[] args) {
		
		Class clazz= Car.class;
		
//		String poto1 = clazz.getResource("깡아지2.jpg").getPath();
		String poto2 = clazz.getResource("다운로드.jpg").getPath();
		
		System.out.println(poto2);
		
		
		
		

	}

}
