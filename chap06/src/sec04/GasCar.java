package sec04;

public class GasCar {
	// setoil getLocation 스캐너,0 = boolean
	int gas;
	
	
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("가스가 5만큼 충전되었습니다.");
		
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가없습니다");
			return false;
		}
		System.out.println("가스가 있습니다");
		return true;
	}
		void run() {
			while (true) {
				if(gas>0) {
					System.out.println("가스잔량 :"+ gas);
					gas -=1;
				}else {
					System.out.println("가스잔량:"+gas);
					return ;
				}
			}
		}
}
