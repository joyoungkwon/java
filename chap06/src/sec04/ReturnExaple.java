package sec04;

public class ReturnExaple {

	
		int plus (int x , int y) {
			int result = x + y;
			return result;
		}
		int plus2 (int x, int y) {
			byte result = (byte)(x+y);
			return result;
		}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ReturnExaple retn = new ReturnExaple ();
		int result1 = retn.plus2(200, 300);
		System.out.println(result1);

	}

}
