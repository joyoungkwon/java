package sec01;

public class Board {
	String subject; //����
	String content; // ����
	String witer; // ����ϴ� ����. (�۾���)
	
	
	public Board(String subject, String content, String witer) {
		this.subject = subject;
		this.content = content;
		this.witer = witer;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWiter() {
		return witer;
	}


	public void setWiter(String witer) {
		this.witer = witer;
	}
	
	
	

}
