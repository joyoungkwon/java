package src01;

import java.io.Serializable; // 클래스 구현 직렬화
import java.util.Date; // date타입.

public class Board  implements Serializable{
	// 클래스의 직렬화 데이터베이스연동시 직렬화 꼭필요.
	// (직렬화설명) 길게 뻗게만들기.짜르기쉽게.
	
	
	private int bno; // 게시판 번호.
	private String subject; //제목
	private String content; // 내용
	private String witer; // 사용하는 유저. (글쓴이)
	private Date date; // 작성날짜
	private String Title;
	
	// 생성자
	public Board(int bno, String subject, String content, String witer, Date date) {
		this.bno = bno;
		this.subject = subject;
		this.content = content;
		this.witer = witer;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	
}