package sec02;

public class Car2 {
	Car car = new Car() { // ī�� ��ü�� ����� �͸� ��ü�� ��� (�̸� x �׷����͸�) �޼ҵ尡 �����°� �ƴ϶� ; �� ���ʿ� �ϰ� �߰�ȣ ���� ;���� ������.
		int speed;

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("�ӵ���" + speed + "��ŭ\t�����߾");
		}

		@Override
		void Stop() {
			speedUp(10);
			System.out.println("�ڵ�����10��ŭ �ۿ� �ȴ޷���");
		}
	};

	void speedDown() {
		Car downCar = new Car() {

			void speedDown(int speed) {
				this.speed -= speed;
				System.out.println("���ǵ尡," + speed + "��ŭ �����߾");

			}

			@Override
			void Stop() {
				speedDown(10);
				System.out.println("���ǰ��� " + speed + "��ŭ\t�����ϴ�\t������");
			}
		};
		downCar.Stop();
	}

}
