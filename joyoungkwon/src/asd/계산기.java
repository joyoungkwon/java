package asd;

import java.util.Scanner;

public class ���� {
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int result=0; // �ʱ�ȭ
	      System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> "); // �Է� 
	      int a = s.nextInt(); //a 
	      int b = s.nextInt(); //b
	      char c = s.next().charAt(0); // ������. ù��° +,-,*,/
	      Calc cal; // �߻�Ŭ����
	      switch(c) { // ����ġ�� �Է��� ���̶� ����.(���ù�)
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("�߸��� ������ �Դϴ�.");
	         return; // �ٸ��� �Է½�.
	      }
	      cal.setValue(a, b); // �߻� ȣ��
	      result = cal.calculate(); // ��ӹ��� �� Ŭ������ �������̵��� �޼ҵ� ȣ�� �ϰ� result�� ����.
	      System.out.println(result);
	   }
	}