package sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	//getter setter때문에 private의 의미가 없어짐..!
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;		//음수 검사
			return;
		} else {
			this.speed = speed;
		}
		//양수와 0만 들어갈 수 있음
	}
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
