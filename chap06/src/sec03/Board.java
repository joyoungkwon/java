package sec03;
//생성자
public class Board {
	String title;
	String cotnet;
	String writer = "로그인한 회원아이디";
	String date = "현재 컴퓨터 날짜";
	int hitcount = 0;

	// 생성자 중복 코드 최적화
	// 겹치는 것 title , cotnet, writer, date, hitcount.
	// 정해진것 writer, date, hitcount
	// this 로 받아오는건 메게 변수 입력 
	// 정해진걸 바꿀 필요가 없을땐 값을 따로 주지 않음
	
	public Board(String title, String cotnet) {

		this(title, cotnet, "로그인한 회원아이디", "현재컴퓨터 날짜", 0); // title , cotnet만 this 로 값을 불러올때(정해지지않을때 내가 넣는 문자열)
	}
 
	public Board(String title, String cotnet, String writer) { // title , cotnet , writer만 this 로 값을 불러올때(정해지지않을때 내가 넣는 문자열)
		this(title, cotnet, writer,"현재 컴퓨터 날짜", 0); //
	}

	public Board(String title, String cotnet, String writer, String date) {
		this(title, cotnet, writer, date, 0); // title , cotnet , writer, date만 this 로 값을 불러올때(정해지지않을때 내가 넣는 문자열)
	}

	public Board(String title, String cotnet, String writer, String date, int hitcount) { // 모두 값을 this 로 불러오고 값을 받을때.
		this.title = title;
		this.cotnet = cotnet;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
