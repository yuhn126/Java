package sec07.exam04_other_constructor_call;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
	}
	
	Car(String model){
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		
		//System.out.println("Car(Sting model) 실행");		->에러
		
		this(model, null, 0);		//this는 생성자의 첫 줄에 작성되어야함
		
		System.out.println("Car(Sting model) 실행");
	}
	
	Car(String model, String color){
		/*this.model = model;
		this.color = color;
		this.maxSpeed = 0;*/
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
