package sec01;

public class FindAndReplaecExample {

	public static void main(String[] args) {
		String str ="��� ���α׷� ���� �ڹٷ� ���� �Ҽ� �ִ�"; // index��.
		int index = str.indexOf("�ڹ�");
		
		String newstr = str.replace("�ڹ�", "Java"); // ���ڿ��ٲٱ�
		
		System.out.println(newstr);
	}

}
