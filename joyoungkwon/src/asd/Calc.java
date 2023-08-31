package asd;

abstract class Calc { // 추상 클래스.
	protected int a; // 필드변수
	protected int b;

	public void setValue(int a, int b) { // 생성자.
		this.a = a;
		this.b = b;
	}

	abstract int calculate();// 추상 메소드.
}

class Add extends Calc { // Add 더하기 클래스 Calc 상속
	public int calculate() {// a+b 를 return 하는 메소드
		return a + b;
	}
}

class Sub extends Calc {// 상속
	public int calculate() { // -
		return a - b;
	}
}

class Mul extends Calc {//상속
	public int calculate() { //*
		return a * b;
	}
}

class Div extends Calc { // 상속
	public int calculate() { // 나누기.
		// 0으로 나누는것만 , 0으로 나누면 소수점.
		if (b == 0)
			return -1;
		return a / b;
	}
}
