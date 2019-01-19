package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;		//필드 gas임!
	}	//연료 주입 메소드
	
	boolean isLeftGas(){
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}	//연료 확인 메소드
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return;
			}
		}
	}	//달리는 동작 메소드
	
}
