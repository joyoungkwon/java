package sec01;

import java.util.*;

public class CarExample {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {
			
			System.out.println("수행할 작업을 선택하세요 1 추가 2 삭제 3 출력 4 종료");
			String a = s.next();
			try {
				
				int delNum = s.nextInt();list.remove(delNum);
				// 내가 발생한 예외.
				//Index 2 out of bounds for length 0
				
			} catch (Exception e) {
				System.out.println(e.getMessage()+"잘못입력");
				// 예외가 생겼을때  catch로 e 예외 변수 메소드 get으로 예외 이름 알아오기
				
				return;
				// 종료
			}

			switch (a) {
			case "1":
				System.out.println("추가할 데이터를 입력하세요");
				String company = s.next();
				String color = s.next();
				int maxSpeed = s.nextInt();
				int cost = s.nextInt();
				list.add(new Car(company,  cost,  maxSpeed,  color));
				// car의 객체 생성후 스캐너를 입력해서 받은 값을 car생성자의
				// 파라미터 값으로 넘겨주기
				
				break;
				
			case "2":
				System.out.println("삭제할 데이터를 입력하세요");
				int delNum = s.nextInt();
				list.remove(delNum);
				break;
			case "3":
				for(int i = 0 ; i<list.size(); i++) {
					Car car2 = list.get(i);
					System.out.println("차 색깔 : "+car2.color+"\n제조회사 : "+car2.company+"\n"
							+ "가격 : "+car2.cost+"\n최고속력 : "+car2.maxSpeed);
				}
				break;
			case "4":
				start = false;
				System.out.println("프로그램 종료");
			}
			
			}
			
			
			
		}
		// 1번 누르면 데이터를 추가(add)
		// 사용자로 부터 데이터를 입력받아 리스트에 추가시키기.

		// 2번 누르면 데이터를 삭제.(remove)
		// 사용자로 부터 데이터를 입력받아 데이터를 삭제.

		// 3 데이터 출력
		// 입력된 리스트 데이터를 모두 출력하세요.

		// 4 번을 누르면 종료 하게 만들기
		// 출력구문 false;

	}


