package part01;

public class Practice02 {
	public int sumFor(int n) {
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.print(i);
			sum+=i;
			if(i==n) break;
			System.out.print("+");
		}
		
		System.out.print("=");
		return sum;
	}
	
	public static void main(String[] args) {
		Practice02 p2 = new Practice02();
		System.out.println(p2.sumFor(7));
		System.out.println(p2.sumFor(8));
	}
}
