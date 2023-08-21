package study01;

public class ArrayLotto {

	public static void main(String[] args) {
		
		int ball[]= new int [45]; // 45만큼 저장할 배열 생성
		
		for(int i =0; i<ball.length; i++) { //배열의 길이만큼 45 번 도는 포문
			ball[i] = i+1; // ball의 i번쨰 방마다 i + 1 를 저장 i가 0일떈 1
			// 1일땐 2
			//3 일땐 4
		}
		int tmp =0; // int 타입 변수 선언및 초기화 전역 변수로 사용하기위함.
		int j =0;
		
		for (int i =0; i<6; i++) { // for 가 6번 반복문. 
			j = (int)(Math.random()*45);// int j 에 랜덤 난수 생성.
			tmp =ball[i]; // tmp의 ball 배열의 i번쨰 방을 대입.
			ball[i]=ball[j]; // i 번째 방에 난수를 대입.
			ball[j]=tmp; // j의 다시 템프를 대입.
		}
		for(int i =0; i<6; i++) {
			System.out.println("ball"+"["+i+"]"+"="+ball[i]);
		}
	}

}
