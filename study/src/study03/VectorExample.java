package study03;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("예린이랑카페공부","재밌었다","조영권"));
		
		for(int i =0; i <list.size(); i++) {
			Board br = list.get(i);
			System.out.println("\n제목은 :"+br.subject+"\n내용은 :"+br.content+"\n글쓴이 :"+br.user);
		}
		System.out.println();
		for(Board brr : list ) {
			System.out.println(brr.content + brr.subject+ brr.user);
		}
		
	}

}
