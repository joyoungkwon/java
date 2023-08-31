package sec02;

public class Grade {
 	private	int math;
 	private int science;
 	private int english;
	
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english =english;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}

	public double average() {
		int sum =(int) (getMath()+getScience()+getEnglish()/3);
		return  sum;
	}
	
}
