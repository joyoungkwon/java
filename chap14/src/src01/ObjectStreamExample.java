package src01;
import java.io.*;
import java.util.*;
import  java.text.*;

public class ObjectStreamExample {
	// Object보조 입출력 
	public static void main(String[] args) throws Exception{
		
		//로직 26line의 메소드 있음.(설명)
		writerList();
		// 로직 43line의 메소드 있음
		List <Board> list = readList();
		//Board클래스 타입의 list를 (readlist)로 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat - date날짜 fromat(초기화 재설정 이런의미인듯)
		//SimpleDateFormat - 날자를 불러올때 형식을 정의 ("yyyy-MM-dd")식으로.
		for(Board board : list) {
			//향상된포문 board 로 list만큼 
			System.out.println(//<-출력구문
			board.getBno()+"\t"+ board.getTitle()+"\t"+
			board.getContent()+"\t"+board.getWiter()+"\t"+
			sdf.format(board.getDate())
			// 출력구문. board의 메소드 
			//sdf는 내가 지정한, 입력방식을 board의 get데이터 메소드로 받아오는 메소드를 대입시킴
			
					);//<- 이거는 그냥 syso 출력구문 넓혀서 안에서 닫은거
		}

	}//<-메인구문 실행 블럭 끝.
	
public static void writerList( )throws Exception{
	// 처음 메인구문에서 호출한 메소드
	//return 값이 없는 void 메서드
	
	List<Board> list  = new ArrayList<>();
	// List인터페이스를 board클래스를 객체로 받는 ArrayList 생성
	list.add(new Board(1,"제목1","aa","bb",new Date()));
	//Board의 생성자 양식맞춰서 add로 추가.
	list.add(new Board(1,"제목2","cc","ff",new Date()));
	list.add(new Board(1,"제목3","ee","qq",new Date()));
	
	FileOutputStream fos = new FileOutputStream("c:/temp/board.db");
	// 파일 무조건 생성.
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	//그걸 읽는 핵심. 오브젝트 보조입출력.
	
	oos.writeObject(list);
	// 오브젝트 보조입출력이라 오브젝트가 파라미터로 와야함
	oos.flush();
	//내보내기
	oos.close();
	//닫기.
}
// return값이 list board인 readList 메소드
// 메인구문에서 List <Board> list = readList();로 호출
// 했기때문에  ↓list<Board>타입으로 리턴.
public static List<Board > readList() throws Exception{
	// 예외처리.
	FileInputStream fis = new FileInputStream("c:/temp/board.db");
	//FileOutStream 으로 생성한 파일을 읽어 들이는 input
	ObjectInputStream ois = new ObjectInputStream(fis);
	// 입출력 보조프로그램을 object로 받아오는 보조 입출력 연결. (fis)
	List<Board> list =(List<Board>) ois.readObject();
	// List 에 객체로 list를 ois.readObject로 읽기위해서
	// 앞에 받아들이는 값으로 강제 변환
	// 즉 캐스팅이 필요함 (중요)
	// list<Board>타입으로 받으면 (List<Board>)으로 
	// 만약 String Integer Char byte 식이면
	// (String)ois.readObject
	// (Integer)ois.readObject
	// (Char)ois.readObject
	// (Byte)ois.readObject
	//식으로 오브젝트 입출력 보조 연결은 꼭 강제 캐스팅이 필요함. 왜냐하면 오브젝트 타입으로 넘기는거기떄문에
	
	return list;
	// 그리고 void 와 다르게 list를 return함.
	
}
}
