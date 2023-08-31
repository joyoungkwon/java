package sec02;

public class 자동차예제1 {

	public static void main(String[] args) {

		Car myCar = new Car(); // Car 객체 생성

		System.out.println("회사이름:" + myCar.company);
		System.out.println("모델명:" + myCar.model);

		myCar.company = "페라리"; // 값 변경 
		myCar.model = "아벤타도르";// 값 변경 
		
		System.out.println("회사이름:" + myCar.company); // 변경값 출력
		System.out.println("모델명:" + myCar.model); // 변경값 출력

	}

}
