package sec01;

import java.util.*;

public class BoardDao {

	//�޼ҵ�ȿ����� Board�� �ѱ�� ����
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("","",""));
		list.add(new Board("","",""));
		list.add(new Board("","",""));
		return list;

	}

}
