package sec05;

public class Singleton {
	
		private static Singleton singleton = new Singleton();
		
		private Singleton () {
	}
		static Singleton getInstance() {
			return singleton;
		}
		public static void main(String[]args) {
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
			// �̱� ��ü�� �޼ҵ� �̸��� �Է��ϰ� . ��� get���� �޾ƿ�
			// �̱� ��ü�� ���� ��ü�� ������� - Single �� �ѹ��� ���� ��Ű�� ����.
			// �̱۰�ü �ܺο��� ��ü�� �������� get.��
			
			// ex �Ｚ ȸ�� class�� ���� �ϸ� �� ȸ�� �� �ҷ��ö� ȥ�� 
			// singleton - private �̶�� ���������� �� ����Ͽ� ����
			// private �޼ҵ� �ȿ��� �ѹ��� �޸𸮸� �����ϰ� �װ� �ٸ� ��ü�� �޾Ƽ� �������
			// �ܺ� ���� singleton �޼ҵ带 �ҷ��ö� ���� Ÿ���� ���ο� ��ü�� �����Ͽ�
			//getInstance �� �����
			
			
			
			if(obj1==obj2) {
				System.out.println("������ü");
			}else {
				System.out.println("�ٸ���ü");
			}
		}
}
