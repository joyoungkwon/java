package qhrkd;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("인원수");
		int num = s.nextInt(); // 인원수 배열의 몇칸짜리 만들지 정함.
		Phone phone[] = new Phone[num]; // 배열 선언과 배열 값을 동시에.
		int i; // 전역변수
		
		//배열의 길이만큼 반복해서 이름과 번호를 입력받아
		//각 배열의 방의 객체 생성 후 대입.
		
		for (i=0; i<phone.length;i++) {
			System.out.println("이름전화번호(이름과 번호는 빈칸없이 입력");
			String name = s.next();
			String phonNumber = s.next();
			phone[i]= new Phone(name,phonNumber);
		}
		System.out.println("저장되었슴");
		while(true) {
			System.out.println("검색할이름");
			String name = s.next();
			for(i =0; i<num;i++) {
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"의번호는"+phone[i].getPhonNumber());
					i--;
					break;
				}
			}
			if(name.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			if(i==num) {
				System.out.println(name+"이 없습니다.");
			}
		}
	}

}
