package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		// Animal animal = new Animal = �߻�ȭ Ŭ������ ��ü ���� �Ұ���

		dog.sound();
		cat.sound();

		// �ڵ�Ÿ�Ժ�ȯ

		Animal animal = new Dog(); // Dog Ÿ�� ��ü ����� animal ��ü �� ����
		animal.sound();
		// animal �߻� Ŭ������ ��� ���� DogŬ������ Override ��
		// Dog�� �޼ҵ� ���
		
		animalSound(new Dog());
		
	}
	// �Ķ���Ͱ� Animal Ÿ�� �޼ҵ�.
	public static void animalSound(Animal animal) { // Animal - Ŭ���� �Ѱ���
		animal.breathe();
	}

}
