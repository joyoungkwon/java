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
			// 싱글 객체는 메소드 이름을 입력하고 . 찍고 get으로 받아옴
			// 싱글 객체는 같은 객체를 가지고옴 - Single 이 한번만 저장 시키기 때문.
			// 싱글객체 외부에서 객체를 얻을려면 get.임
			
			// ex 삼성 회사 class를 생성 하면 그 회사 를 불러올때 혼동 
			// singleton - private 이라는 접근제한자 를 사용하여 생성
			// private 메소드 안에는 한번에 메모리를 생성하고 그걸 다른 객체로 받아서 사용을함
			// 외부 에서 singleton 메소드를 불러올때 받을 타입의 새로운 객체를 생성하여
			//getInstance 로 끌어옴
			
			
			
			if(obj1==obj2) {
				System.out.println("같은객체");
			}else {
				System.out.println("다른객체");
			}
		}
}
