package sec01;

public class Gesipan {
	int number ; // 게시판 글번호
	String subject ; // 게시판 제목
	String content; // 게시판 내용
	String user ; // 글쓴이
	
	
	// 생성자 .(using filde)
	
	public Gesipan(int number, String subject, String content, String user) {
		this.number = number;
		this.subject = subject;
		this.content = content;
		this.user = user;
	}
	
}
