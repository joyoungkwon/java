package sec01;

import java.util.*;

public class BoardDao {

	//메소드안에서도 Board를 넘길수 있음
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("","",""));
		list.add(new Board("","",""));
		list.add(new Board("","",""));
		return list;

	}

}
