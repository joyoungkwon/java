package sec02;

import sec02.DataAccessObject;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB�� ����");
	}
	
	
	
}
