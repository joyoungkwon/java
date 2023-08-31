package asd;

abstract class Calc { // �߻� Ŭ����.
	protected int a; // �ʵ庯��
	protected int b;

	public void setValue(int a, int b) { // ������.
		this.a = a;
		this.b = b;
	}

	abstract int calculate();// �߻� �޼ҵ�.
}

class Add extends Calc { // Add ���ϱ� Ŭ���� Calc ���
	public int calculate() {// a+b �� return �ϴ� �޼ҵ�
		return a + b;
	}
}

class Sub extends Calc {// ���
	public int calculate() { // -
		return a - b;
	}
}

class Mul extends Calc {//���
	public int calculate() { //*
		return a * b;
	}
}

class Div extends Calc { // ���
	public int calculate() { // ������.
		// 0���� �����°͸� , 0���� ������ �Ҽ���.
		if (b == 0)
			return -1;
		return a / b;
	}
}
