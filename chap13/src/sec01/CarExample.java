package sec01;

import java.util.*;

public class CarExample {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {
			
			System.out.println("������ �۾��� �����ϼ��� 1 �߰� 2 ���� 3 ��� 4 ����");
			String a = s.next();
			try {
				
				int delNum = s.nextInt();list.remove(delNum);
				// ���� �߻��� ����.
				//Index 2 out of bounds for length 0
				
			} catch (Exception e) {
				System.out.println(e.getMessage()+"�߸��Է�");
				// ���ܰ� ��������  catch�� e ���� ���� �޼ҵ� get���� ���� �̸� �˾ƿ���
				
				return;
				// ����
			}

			switch (a) {
			case "1":
				System.out.println("�߰��� �����͸� �Է��ϼ���");
				String company = s.next();
				String color = s.next();
				int maxSpeed = s.nextInt();
				int cost = s.nextInt();
				list.add(new Car(company,  cost,  maxSpeed,  color));
				// car�� ��ü ������ ��ĳ�ʸ� �Է��ؼ� ���� ���� car��������
				// �Ķ���� ������ �Ѱ��ֱ�
				
				break;
				
			case "2":
				System.out.println("������ �����͸� �Է��ϼ���");
				int delNum = s.nextInt();
				list.remove(delNum);
				break;
			case "3":
				for(int i = 0 ; i<list.size(); i++) {
					Car car2 = list.get(i);
					System.out.println("�� ���� : "+car2.color+"\n����ȸ�� : "+car2.company+"\n"
							+ "���� : "+car2.cost+"\n�ְ�ӷ� : "+car2.maxSpeed);
				}
				break;
			case "4":
				start = false;
				System.out.println("���α׷� ����");
			}
			
			}
			
			
			
		}
		// 1�� ������ �����͸� �߰�(add)
		// ����ڷ� ���� �����͸� �Է¹޾� ����Ʈ�� �߰���Ű��.

		// 2�� ������ �����͸� ����.(remove)
		// ����ڷ� ���� �����͸� �Է¹޾� �����͸� ����.

		// 3 ������ ���
		// �Էµ� ����Ʈ �����͸� ��� ����ϼ���.

		// 4 ���� ������ ���� �ϰ� �����
		// ��±��� false;

	}


