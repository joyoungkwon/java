package sec01.exam01;

public class 변수값교환 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x +",y:" + y);
		// 변수 x 값 설정 3
		
		int temp = x; // 변수x 3값 저장 temp의 저장
			
		x = y ;
		// x 변수에 에 변수 값을 대입시킴 x= 5;
		y = temp;
		//변수 y에 변수 temp값을 대입시킴 y = 3;
		//해당구문은 변수 x 와 y값을 서로 교체하는 구문
		System.out.println("x:"+ x +",y:"+ y);
	}

}
