package sec06.exam02.mycompany;

import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
// 다른 메소드 를 끌어오는 임포트 구문


public class Car {
	SnowTire tire1 = new SnowTire();
	// 임포트 시키면 새로운 객체를 생성 가능
//	Tire  tire2 = new Tire(); 다른 패키지에 있을때 클레스 이름이 다르면 다른 파일로 인식하지만
// 	정확히 어디 파일의 있는걸 끌어올때는 아랫 구문을 참조함
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire(); // 한국타이어
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); // 금호 타이어
//	자동단축키 ctrl shift o 
	
	

}
