package sec03;
//������
public class Car2 {
	String company="�����ڵ���";
	String model ;
	String color ;
	int maxSpeaed;       
	int speed;
	
	
	Car2(){
		
	}


	public Car2(String model) {
		this(model,"����",250);
	}


	public Car2(String model, String color)
{
		this(model,color,250);
	}


	public Car2(String model, String color, int maxSpeaed) {
		this.model = model;
		this.color = color;
		this.maxSpeaed = maxSpeaed;
	}
	
	}

