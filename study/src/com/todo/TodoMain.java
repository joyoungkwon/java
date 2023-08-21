package com.todo;

import java.util.*;
import com.todo.dao.*;
import com.todo.menu.*;
import com.todo.service.*;

public class TodoMain {

	public static void start() {
		Scanner s = new Scanner(System.in); // ��ĳ�� ����Ʈ
		TodoList l = new TodoList(); // TodoList ��ü l�� ����
		boolean isList = false; // ���� Ÿ�� boolean ���� false;�ʱ⼳��
		boolean quit = false;

		Menu.displaymenu(); // �޴��� �����ִ� ���÷��� �޼���

		do {
			Menu.prompt(); // �޴��� ������Ʈ �޼���
			isList = false;
			String choice = s.next(); // ����
			switch (choice) {// �������� switch ����.

			case "add":
				TodoUtil.crateItem(l);
				break;
			case "del":
				TodoUtil.deleteItem(l);
				break;
			case "edit":
				TodoUtil.updateItem(l);
				break;
			case "ls":
				TodoUtil.listAll(l);
				break;
			case "ls_name_asc":
				l.sortByName();
				System.out.println("��������� �����Ͽ����ϴ�");
				isList = true;
				break;
			case "ls_name_desc":
				l.sortByName();
				l.reverseList();
				System.out.println("��������� �����Ͽ����ϴ�");
				isList = true;
				break;
			case "help":
				Menu.displaymenu();
				break;
			case "ls_date":
				l.sortByDate();
				System.out.println("��¥�� ���� �����߽��ϴ�");
				isList = true;
				break;
			case "exit":
				TodoUtil.listAll(l);
				System.out.println("���θ���Ʈ�� �����մϴ�.");
				quit = true;
				break;
			default:
				System.out.println("��Ȯ�� ��ɾ �Է��ϼ��� (������-help�Դϴ�.)");
				break;

			}
			if (isList)
				TodoUtil.listAll(l);
		} while (!quit);

	}

}
