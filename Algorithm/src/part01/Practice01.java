package part01;

//p19
public class Practice01 {
	public int max4(int a, int b, int c, int d) { //네 값의 최댓값을 구하는 max4 메서드 작성
		int max = a;
		if(max<b) max=b;
		if(max<c) max=c;
		if(max<d) max=d;
		return max;
	}
	
	public int min3(int a, int b, int c) {
		int min=a;
		if(min>b) min=b;
		if(min>c) min=c;
		return min;
	}
	
	public static void main(String[] args) {
		Practice01 p1 = new Practice01();
		System.out.println("max4 = " + p1.max4(1, 3, 4, 2));
		System.out.println("min3 = " + p1.min3(2, 3, 4));
	}
}
