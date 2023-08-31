package sec01;

public class Member {
	public String name ;
	public int age ;
	
	// 필드 파라미터 
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) { // 최상위 obj 메소드 오버라이드
		if(obj instanceof Member) { //obj 객체 비교 instanceof
			Member member = (Member)obj;
			return  member.equals(name)&&(member.age==age);
			
		}else {
			return false;
		}
	}
	
	
}
