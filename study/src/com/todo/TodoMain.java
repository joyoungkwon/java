package com.todo;

import java.util.*;
import com.todo.dao.*;
import com.todo.menu.*;
import com.todo.service.*;

public class TodoMain {
	
	// Ŭ���� �޼ҵ�� �����Ǿ�����
	public static void start() {
		Scanner s = new Scanner(System.in); // ��ĳ�� ����Ʈ
		TodoList l = new TodoList(); // TodoList ��ü l�� ����
		boolean isList = false; // ���� Ÿ�� boolean ���� false;�ʱ⼳��
		boolean quit = false;

		Menu.displaymenu(); // �޴��� �����ִ� ���÷��� �޼���

		do {
			Menu.prompt(); // �޴��� ������Ʈ �޼���
			isList = false; // isList false ���� ���� -line 68
			String choice = s.next(); // ����
			switch (choice) {// �������� switch ����.
			// �Է��� Ű�� �� �ҷ����� �޼���
			case "�߰�":
				TodoUtil.crateItem(l); // �߰��޼���
				break;
			case "����":
				TodoUtil.deleteItem(l);//�����޼���
				break;
			case "����":
				TodoUtil.updateItem(l);//�����޼���
				break;
			case "��ü���":
				TodoUtil.listAll(l);//list �� ����Ǿ��ִ� ����Ʈ ��¸޼���
				break;
			case "��������": // asc(����)�� �����϶�
				l.sortByName(); // Comparator �������̵� �� �޼��� ȣ��
				System.out.println("��������� �����Ͽ����ϴ�");
				isList = true;
				break;
			case "���񿪼�����": // ������ϋ� (����)
				l.sortByName(); // ���� ȣ���ϰ�
				l.reverseList(); // �����������
				System.out.println("������ �������� �����Ͽ����ϴ�");
				isList = true;
				break;
			case "����": // ���� ȣ��
				Menu.displaymenu(); // �׳� ���÷��̸޴� ȣ�� (��¸޼���)
				break;
			case "��¥����": // ��¥ �� ���� �޼���
				l.sortByDate(); // Comparator �������̵��ؼ� ��¥�� �޾ƿ� date�޼���
				System.out.println("��¥�� ���� �����߽��ϴ�"); 
				isList = true;
				break;
			case "����": // ������ Ű
				System.out.println("���峻��"); // ���峻���� �����ְڴ�
				TodoUtil.listAll(l); // list�� ���ִ� list�� all
				System.out.println("���θ���Ʈ�� �����մϴ�."); // ����
				quit = true;
				break;
			default:
				System.out.println("��Ȯ�� ��ɾ �Է��ϼ��� (�������ʿ��ϸ�"
						+ "������ �Է��ϼ���)");
				break;

			}
			if (isList) 
				TodoUtil.listAll(l); // isList �� true �̸� ����Ȱ��� ����ض�.
		} while (!quit); // while�� �ݱ�

	}

}
