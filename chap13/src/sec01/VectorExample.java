package sec01;
import  java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board>list = new Vector<Board>();
		//
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2" ,"����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		
		for(int i = 0; i<list.size(); i++) {
			Board  board = list.get(i);
			System.out.println(board.content + board.subject+ board.witer);
		}
		System.out.println();
		
			for(Board board2 : list) { //���������ʴ� list ��ŭ�� Board  ��ü�� ����ڴ�.
				System.out.println(board2.content + board2.subject+ board2.witer);
			}
		

	}

}
