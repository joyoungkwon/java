package sec01;

public class CallListener implements Button.OnClickListener{

	@Override
	public void onclick() {
		System.out.println("메세지를 보냅니다.");
	}

}
