package sec01;

public class MyPoint {
	int a;
	int b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyPoint) { // 인스턴스 오프 , 객체가 같은지 비교
			MyPoint mypoint = (MyPoint) obj; // 오브젝트 호출(?)
			if (obj.equals(mypoint.a)) { // 오브젝트 에 내가 가지고 있는 my point a 를 비교
				return true; // 맞으면 참 값 return;
			}
		}
		return false; // 틀리면 거짓 값 return;
	}

	@Override
	public String toString() { // system.out.plintln 이 원래 to String 의 메소드를 호출 하는거.
		//(object) 안에 있는 내가만든 변수나, 
		// 원하고자 하는 값을 object 안에 있는 내가 만든 변수나 원하는 값을 출력.
		// 그거를 이제 to String 값으로 메소드를 오버라이딩 해서 원하는값으로 출력
		return "Point(" + a + ", " + b + ")";
		//to String 생성자에서 파라미터 값을 넘겨준 값을 to String 으로 
		// return 시키고 내가 가지고 생각하는 값으로 비교
	}

}
