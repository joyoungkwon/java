package sec01;
import  java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board>list = new Vector<Board>();
		//
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2" ,"내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		
		for(int i = 0; i<list.size(); i++) {
			Board  board = list.get(i);
			System.out.println(board.content + board.subject+ board.witer);
		}
		System.out.println();
		
			for(Board board2 : list) { //정해지지않는 list 만큼의 Board  객체를 만들겠다.
				System.out.println(board2.content + board2.subject+ board2.witer);
			}
		

	}

}
