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
		//x�� z�� ���� �� 1 ����
		
		System.out.println("------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		//1���� �� z�� ����
		
		System.out.println("------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);	//x�� ������ �� 1 ����

	}

}
