package sec04;

public class Travel {
	// Travel 클래스 설정
	// 멤버 변수 oil location 선언
	// 초기값 20 광주 설정 필드에서 설정 x 메소드에서 받아오기
	// 는 행동 (실행) (값 return)

	int oil;
	String location;
	

	
	// 휘발유 감소 메소드 생성
	// 휘발유 남았을시 "휘발류가 남았어요 계속 여행 하세요" 출력 void oilMinus
	// 없으면 " 휘발류가없어요 여행 종료하세요 " 출력 boolean isOilLeft
	// boolean 으로 0 이 true 일때 if(문)

	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	void oilMinus(int x) {
		  oil -= x;
		  
	 }
	  boolean isoilLeft() {
		  if(oil==0) {
			  System.out.println("휘발류가 없습니다 여행을 종료하세요");
			  return false;
		  }else {
			  System.out.println("휘발류가 남았습니다 여행을 계속하세요");
			  return true;
		  }
		 
	  }
		  
	  }
	

