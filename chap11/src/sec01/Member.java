package sec01;

public class Member {
	public String id;
	
	
	public Member(String id) {
		this.id =id;
		
	}


	@Override
	public boolean equals(Object obj) {// 오브젝트로 같은지
		if(obj instanceof Member) { //obj instanceof 오브젝트가 같을떄
			Member member = (Member) obj;
			if(id.equals(member.id)) { // 오브젝트 확인후 생성자 같은지비교
				return true;
			}
		}
		return false;
	}
	
}
