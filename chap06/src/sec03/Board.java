package sec03;
//������
public class Board {
	String title;
	String cotnet;
	String writer = "�α����� ȸ�����̵�";
	String date = "���� ��ǻ�� ��¥";
	int hitcount = 0;

	// ������ �ߺ� �ڵ� ����ȭ
	// ��ġ�� �� title , cotnet, writer, date, hitcount.
	// �������� writer, date, hitcount
	// this �� �޾ƿ��°� �ް� ���� �Է� 
	// �������� �ٲ� �ʿ䰡 ������ ���� ���� ���� ����
	
	public Board(String title, String cotnet) {

		this(title, cotnet, "�α����� ȸ�����̵�", "������ǻ�� ��¥", 0); // title , cotnet�� this �� ���� �ҷ��ö�(�������������� ���� �ִ� ���ڿ�)
	}
 
	public Board(String title, String cotnet, String writer) { // title , cotnet , writer�� this �� ���� �ҷ��ö�(�������������� ���� �ִ� ���ڿ�)
		this(title, cotnet, writer,"���� ��ǻ�� ��¥", 0); //
	}

	public Board(String title, String cotnet, String writer, String date) {
		this(title, cotnet, writer, date, 0); // title , cotnet , writer, date�� this �� ���� �ҷ��ö�(�������������� ���� �ִ� ���ڿ�)
	}

	public Board(String title, String cotnet, String writer, String date, int hitcount) { // ��� ���� this �� �ҷ����� ���� ������.
		this.title = title;
		this.cotnet = cotnet;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
