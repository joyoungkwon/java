package sec02;

public class Car2 {
	Car car = new Car() { // 카의 객체를 만들고 익명 객체를 사용 (이름 x 그래서익명) 메소드가 끝나는게 아니라 ; 이 불필요 하고 중괄호 끝에 ;으로 마무리.
		int speed;

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("속도가" + speed + "만큼\t증가했어여");
		}

		@Override
		void Stop() {
			speedUp(10);
			System.out.println("자동차가10만큼 밖에 안달려여");
		}
	};

	void speedDown() {
		Car downCar = new Car() {

			void speedDown(int speed) {
				this.speed -= speed;
				System.out.println("스피드가," + speed + "만큼 감소했어여");

			}

			@Override
			void Stop() {
				speedDown(10);
				System.out.println("스피가드 " + speed + "만큼\t감소하다\t가멈췄어여");
			}
		};
		downCar.Stop();
	}

}
