package sec01;

import java.util.Scanner;

public class IndexOfExmaple {

	public static void main(String[] args) {
		
		String str1 = "나는 자바를 싫어해요 ";
		
		int index =str1.indexOf("코드"); //fasle;값나옴 뭘또 힌트래
		System.out.println(index);
		
		
		String str2 = "중흥,두암,운암,용붕,";
		int index1 = str2.indexOf("중흥");
		 str2 = "중흥,두암,운암,용붕,";
		int index2 = str2.indexOf("두암");
		str2 = "중흥,두암,운암,용붕,";
		int index3 = str2.indexOf("운암");
		str2 = "중흥,두암,운암,용붕,";
		int index4 = str2.indexOf("용붕");
		
		
													// 주소를 입력 받음.
													// 주소에 중흥,두암,운암,용붕,이 들어가면. 북구거주민입니다 출력
													// 아니면 북구 거주민이 아닙니다.
		
		Scanner s = new Scanner(System.in);
		System.out.println("거주지를 입력하세요");
		String myHome = s.next();
		
		if(str2.indexOf(index1)!=-1 || str2.indexOf(index2) != -1 || str2.indexOf(index3)!=-1||
				str2.indexOf(index4)!=-1) {
			System.out.println("당신은 북구 주민입니다.");
		}else {
			System.out.println("당신은 북구 주민이 아닙니다.");
		}
		
		
		
		

	}

}
