package sec01;

public class Outter {
	String name ="ȫ�浿";
	
	void reName() {
		System.out.println("ȫ�浿�����̸�����");
	}
	
	class Nested{
		String name ="�嵿��";
		void reName() {
			System.out.println("�嵿�������̸�����");
		}
		void print() {
			System.out.println(this.name); // Nested Ŭ���� name ȣ��
			System.out.println(Outter.this.name); // Outter Ŭ���� name ȣ��
		}
		
	}
	
	
	}

