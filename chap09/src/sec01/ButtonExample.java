package sec01;

public class ButtonExample {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new CallListener());
		button.touch();

	}

}
