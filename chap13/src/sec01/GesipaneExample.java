package sec01;

import java.util.List;
import java.util.*;

public class GesipaneExample {

	public static void main(String[] args) {
		List<Gesipan> list = new ArrayList<>();

		list.add(new Gesipan(1, "A", "B", "C"));
		list.add(new Gesipan(2, "A", "B", "C"));
		list.add(new Gesipan(3, "A", "B", "C"));
		list.add(new Gesipan(4, "A", "B", "C"));

		for (int i = 0; i < list.size(); i++) {
			
			Gesipan ges = list.get(i);
			System.out.println(ges.number + ges.content + ges.subject + ges.user);
			// .찍고 필드값 호출

		}
	}

}
