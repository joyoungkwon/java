package sec01;

public class Member {
	public String name ;
	public int age ;
	
	// �ʵ� �Ķ���� 
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) { // �ֻ��� obj �޼ҵ� �������̵�
		if(obj instanceof Member) { //obj ��ü �� instanceof
			Member member = (Member)obj;
			return  member.equals(name)&&(member.age==age);
			
		}else {
			return false;
		}
	}
	
	
}
