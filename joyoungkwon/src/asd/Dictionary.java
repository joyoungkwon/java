package asd;

class Dictionary extends PairMap {
	private int set; //데이터삽입후 추가한 배열번호를 증가시키려는 필드
	int k =0;

	public Dictionary(int num) { //생성자.파라미터 int num
		KeyArray = new String[num];
		valueArray = new String[num];
		this.set = 0; // 
	}
	// 이름으로 과목을 검색하는 메소드
	public String get(String key) { 
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // 원하는 key가 없다면 null 리턴
	}
 //키(이름)과 값 (과목) 이용하여 배열에 추가
	//단 ,키가중복되면 기존꺼 변경.
	public void put(String key, String value) { //김길동 c set 2
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return; // 중복된 key가 있다면 저장하고 함수 종료
			}
		}
		KeyArray[set] = key;
		valueArray[set] = value;
		set++; // 배열 방번호 증가. //2
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				k++;
				return s; // 삭제된 value 값 리턴
			}
		}
		return null; // 삭제된 것이 없다면 null 리턴
	}

	public int length() {
		return set-k;
	}
}