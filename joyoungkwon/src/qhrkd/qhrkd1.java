package qhrkd;

public class qhrkd1 {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4,},{1,2}};
		
		for(int i =0; i<n.length; i++) { // 첫 번째 포문 배열의 길이 만큼 i 반복
			for(int j =0; j<n[i].length; j++) { // i 가 배열의 제로 인덱스 일때 ""출력
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}
