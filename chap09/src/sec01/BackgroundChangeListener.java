package sec01;

public class BackgroundChangeListener implements CheckBox.OnSelectListener {
 // cheackBox 안에 있는 생성자 lister 을 파라미터로 받기 위한 인터페이스 구현
	// 인터페이스 구현한걸 파라미터 값으로 넘겨 , onSelect 의 메소드를 오버라이딩
	// 그리고 파라미터 값으로 넘어 가면 자기의 메소드 오버라이드 한걸 가져감
	
	@Override
	public void onSelect() {
		System.out.println("배경을변경합니다.");
		
	}

}
