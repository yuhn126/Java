package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
	}
	
	Car(String model){
		//model만 외부에서 받아서 초기화
		this.model = model;
	}
	
	Car(String model, String color){
		//model, color를 외부에서 받아서 초기화
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model, int maxSpeed, String color){
		//String, int, String이라 오버로딩 맞음
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
