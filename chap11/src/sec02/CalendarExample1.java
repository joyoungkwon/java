package sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("���� �ð� :"+hour+"��");
		
		
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm); // 0 �϶� ���� //1�϶� ���� ������ 12:00
		
		
	}

}
