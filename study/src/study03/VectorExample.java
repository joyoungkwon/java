package study03;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("�����̶�ī�����","��վ���","������"));
		
		for(int i =0; i <list.size(); i++) {
			Board br = list.get(i);
			System.out.println("\n������ :"+br.subject+"\n������ :"+br.content+"\n�۾��� :"+br.user);
		}
		System.out.println();
		for(Board brr : list ) {
			System.out.println(brr.content + brr.subject+ brr.user);
		}
		
	}

}
