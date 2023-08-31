package src01;

import java.io.Serializable; // Ŭ���� ���� ����ȭ
import java.util.Date; // dateŸ��.

public class Board  implements Serializable{
	// Ŭ������ ����ȭ �����ͺ��̽������� ����ȭ ���ʿ�.
	// (����ȭ����) ��� ���Ը����.¥���⽱��.
	
	
	private int bno; // �Խ��� ��ȣ.
	private String subject; //����
	private String content; // ����
	private String witer; // ����ϴ� ����. (�۾���)
	private Date date; // �ۼ���¥
	private String Title;
	
	// ������
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