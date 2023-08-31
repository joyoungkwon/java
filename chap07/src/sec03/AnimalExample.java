package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		// Animal animal = new Animal = 추상화 클래스는 객체 생성 불가능

		dog.sound();
		cat.sound();

		// 자동타입변환

		Animal animal = new Dog(); // Dog 타입 객체 만들고 animal 객체 의 대입
		animal.sound();
		// animal 추상 클래스의 상속 받은 Dog클래스에 Override 된
		// Dog의 메소드 출력
		
		animalSound(new Dog());
		
	}
	// 파라미터가 Animal 타입 메소드.
	public static void animalSound(Animal animal) { // Animal - 클레스 넘겨줌
		animal.breathe();
	}

}
