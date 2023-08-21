package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	public static void crateItem(TodoList list ) {
		String title , desc;
		Scanner s = new Scanner(System.in);
		System.out.println("[�׸��߰�]\n"
			+"���� >"	);
		
		title = s.next(); // todolist �� �ִ� isDuplicate(�ߺ�Ȯ�� �޼ҵ�) �� �Ķ���Ͱ��� title�̸�.
		// is Duplicate �� �ߺ��Ȱ��̸� true ���� ��ȯ �ϴ� �޼ҵ���
		if(list.isDuplicate(title)) { // ������ �ߺ��Ǹ� true ���� ��ȯ�Ǿ� "������ �ߺ��˴ϴ� " ���
			System.out.println("������ �ߺ��˴ϴ�.");
			return;
		}
		s.nextLine();
		System.out.println("�߰��Ͻ� ������ > ");
		desc = s.nextLine().trim(); // trim ���� ������ ȭ��Ʈ ���� ���� ���� ���� �б� line
		
		TodoItem t = new TodoItem(title,desc); // todoItem ���ο� title �̶� desc �� �����ͼ�
		list.addItem(t); // ArrayList �� addItem���� ���� ������ t���� �Ѱܼ� �߰���Ŵ
		System.out.println("�Է��Ͻ� ������ �߰� �Ǿ����ϴ�");
	}
	public static void deleteItem(TodoList l) {
		Scanner s = new Scanner(System.in); {
			System.out.println("[�׸����]\n"
					+ "�����Ͻ� �׸��� ������ ���� �Ͻʼ�");
			String title = s.next();
			
			for (TodoItem item : l.getlist()) {
				if(title.equals(item.getTitle())) {
					l.deleteItem(item);
					System.out.println("�Է��Ͻ� ������ �����Ǿ����ϴ�.");
				}
			}
		}
	}
	public static void updateItem(TodoList l) {
		Scanner s = new Scanner (System.in);
		System.out.println("�׸��� ����\n"
				+"������ ������ �Է��ϼ���");
		
		String title = s.next().trim();
		if(!l.isDuplicate(title)) {
			System.out.println("���� �����Դϴ�.");
			return;
		}
		System.out.println("������");
		String new_title = s.next().trim();
		if(l.isDuplicate(new_title)) {
			System.out.println("������ �ߺ��˴ϴ�");
			return;
		}
		s.nextLine();
		System.out.println("������ >");
		String new_description =s.nextLine().trim();
		for(TodoItem item : l.getlist()) {
			if(item.getTitle().equals(title)) {
				l.deleteItem(item);
				TodoItem t = new TodoItem(new_title, new_description);
				l.addItem(t);
				System.out.println("������ �Ϸ��߽��ϴ�.");
			}
		}
	}
	public static void listAll(TodoList l) {
		System.out.println("[��ü ���]");
		for(TodoItem item : l.getlist()) {
			System.out.println(item.toString());
		}
	}
}
