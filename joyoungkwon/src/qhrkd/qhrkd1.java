package qhrkd;

public class qhrkd1 {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4,},{1,2}};
		
		for(int i =0; i<n.length; i++) { // ù ��° ���� �迭�� ���� ��ŭ i �ݺ�
			for(int j =0; j<n[i].length; j++) { // i �� �迭�� ���� �ε��� �϶� ""���
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}
