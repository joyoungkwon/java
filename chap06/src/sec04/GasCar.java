package sec04;

public class GasCar {
	// setoil getLocation ��ĳ��,0 = boolean
	int gas;
	
	
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("������ 5��ŭ �����Ǿ����ϴ�.");
		
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("�����������ϴ�");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�");
		return true;
	}
		void run() {
			while (true) {
				if(gas>0) {
					System.out.println("�����ܷ� :"+ gas);
					gas -=1;
				}else {
					System.out.println("�����ܷ�:"+gas);
					return ;
				}
			}
		}
}
