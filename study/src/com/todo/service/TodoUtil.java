package com.todo.service;
import java.util.*;
import com.todo.dao.TodoItem;
import com.todo.dao.TodoList;

public class TodoUtil {
	// Ŭ���� �޼���� �����
	//����(static) Ŭ������ �ν��Ͻ�ȭ���� �ʰ� ���� Ŭ���� �̸��� ���� ������ �� �ִ� Ŭ����
	
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
	public static void deleteItem(TodoList l) { // 
		Scanner s = new Scanner(System.in); { //��ĳ��
			System.out.println("[�׸����]\n" // ���
					+ "�����Ͻ� �׸��� ������ ���� �Ͻʼ�");
			String title = s.next(); // �޾Ƽ�.
			
			for (TodoItem item : l.getlist()) {
				if(title.equals(item.getTitle())) { // ����ִ� �׸� // �Է¹��� �׸� �� ������
					l.deleteItem(item); // ����
					System.out.println("�Է��Ͻ� ������ �����Ǿ����ϴ�.");
				}
			}
		}
	}
	public static void updateItem(TodoList l) {// ������Ʈ
		Scanner s = new Scanner (System.in);
		System.out.println("�׸��� ����\n"
				+"������ ������ �Է��ϼ���");
		
		String title = s.next().trim(); // ���� - �޾ƿ��� �� trim���� ȭ��Ʈ ���� ����
		if(!l.isDuplicate(title)) { // isDuplicate (title) ����� ���� ������ ���� �����̶�� ����ϰ� ����� ����.
			System.out.println("���������ʴ� �����Դϴ�.");
			return;
		}
		System.out.println("������ �ִ� ������ �����մϴ� �������� �Է��ϼ���"); // �ƴϸ� ����� 
		String new_title = s.next().trim(); // �޾ƿ��°� enter Ű �ν� �� ȭ��Ʈ���� trim���� ����
		if(l.isDuplicate(new_title)) { // �̹� �ִ� �Ŷ� �̹��� ���� ������ ���ؼ� ������ ����Ǿ��ִ°�쿡
			System.out.println("������ �ߺ��˴ϴ�"); // �����ߺ� ��� ������ ����
			return;
		}
		s.nextLine(); // �ƴϸ� enter Ű�� �ޱ�
		System.out.println("������ >"); // ������
		String new_description =s.nextLine().trim();// ���ο� ���� �� s.nextLine���� �ް� trim ���� ���� ����
		for(TodoItem item : l.getlist()) { // ���� ���� item �� l.getList ��ü�� ����
			if(item.getTitle().equals(title)) { //�������� Ÿ��Ʋ�̶� ���� Ÿ��Ʋ ������
				l.deleteItem(item); // l�� ����Ǿ��ִ� item�� ������Ű��
				TodoItem t = new TodoItem(new_title, new_description);
				//TodoItem �� ���ο� ����� ������ 
				l.addItem(t);
				//�߰���Ŵ
				System.out.println("������ �Ϸ��߽��ϴ�.");
				// �����ߴ� ��¹�
			}
		}
	}
	public static void listAll(TodoList l) { // ����Ǿ� �ִ� ����Ʈ ���� �������
		// (��ü�����)
		System.out.println("[��ü ���]");
		// TodoItem item - l.getList ��ü�� ����
		for(TodoItem item : l.getlist()) {
			// toStirng�� �������̵��� �������� ���
			System.out.println(item.toString());
		}
	}
}
