package study01;

public class StringArray {

	public static void main(String[] args) {
		
		String names [] = {"임","반","조"};
		
		
		for(int i = 0; i<names.length; i++) {
		System.out.println("names["+ i +"] : " + names[i]);
		}
		String tmp = names[2];
		System.out.println("tmp :" + tmp);
		
		names[0]= "반";
		
		for(int i =0; i < names.length; i++) {
			System.out.println("names["+i+"]"+ names[i]);
		}
		
	}

}
