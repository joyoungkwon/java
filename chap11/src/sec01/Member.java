package sec01;

public class Member {
	public String id;
	
	
	public Member(String id) {
		this.id =id;
		
	}


	@Override
	public boolean equals(Object obj) {// ������Ʈ�� ������
		if(obj instanceof Member) { //obj instanceof ������Ʈ�� ������
			Member member = (Member) obj;
			if(id.equals(member.id)) { // ������Ʈ Ȯ���� ������ ��������
				return true;
			}
		}
		return false;
	}
	
}
