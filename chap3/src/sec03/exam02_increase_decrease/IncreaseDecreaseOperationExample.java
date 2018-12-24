package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("------------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		//x를 z에 넣은 후 1 증가
		
		System.out.println("------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		//1증가 후 z에 대입
		
		System.out.println("------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);	//x와 더해진 후 1 증가

	}

}
