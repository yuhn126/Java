package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;		//1부터 10까지 합
	
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
}
