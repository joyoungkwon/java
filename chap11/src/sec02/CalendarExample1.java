package sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("현재 시각 :"+hour+"시");
		
		
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm); // 0 일때 오전 //1일땐 오후 기준점 12:00
		
		
	}

}
