package sec01;

public class Board {
	String subject; //제목
	String content; // 내용
	String witer; // 사용하는 유저. (글쓴이)
	
	
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
