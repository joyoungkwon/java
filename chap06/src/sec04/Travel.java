package sec04;

public class Travel {
	// Travel Ŭ���� ����
	// ��� ���� oil location ����
	// �ʱⰪ 20 ���� ���� �ʵ忡�� ���� x �޼ҵ忡�� �޾ƿ���
	// �� �ൿ (����) (�� return)

	int oil;
	String location;
	

	
	// �ֹ��� ���� �޼ҵ� ����
	// �ֹ��� �������� "�ֹ߷��� ���Ҿ�� ��� ���� �ϼ���" ��� void oilMinus
	// ������ " �ֹ߷�������� ���� �����ϼ��� " ��� boolean isOilLeft
	// boolean ���� 0 �� true �϶� if(��)

	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	void oilMinus(int x) {
		  oil -= x;
		  
	 }
	  boolean isoilLeft() {
		  if(oil==0) {
			  System.out.println("�ֹ߷��� �����ϴ� ������ �����ϼ���");
			  return false;
		  }else {
			  System.out.println("�ֹ߷��� ���ҽ��ϴ� ������ ����ϼ���");
			  return true;
		  }
		 
	  }
		  
	  }
	

