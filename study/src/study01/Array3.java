package study01;

public class Array3 {

	public static void main(String[] args) {
		int score [] = {79,88,91,33,55,100,101}; // 배열의 값을 줌 길이도 설정 
		int max =score[0]; // int max 의 score 0 번째 방의 값인  79 를 대입
		int min =score[0]; // 위 설명 같음
		
		for(int i = 1; i<score.length ; i++) { //for 문인데 i 가 배열의 인덱스 만큼 도는 반복문
			if(score[i]>max) { // score 배열의 i 번쨰 방보다 맨처음에 0번째 대입한 79 보다 높으면 max의
				// 새로이 score i 번째 방의 값을 대입
				max= score[i];
			}else if(score[i]<min) { //위에조건을 만족 하지못하고, 아래로 내려올때 scroe i 번째 방보다 맨처음에
				// score 의 0번 째 방보다 min 값이 더 크면 저장시키고 리턴 그렇지 않으면 내비둠
				min = score[i];
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}

}
