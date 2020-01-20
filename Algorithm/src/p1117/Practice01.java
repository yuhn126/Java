package p1117;

import java.util.*;

public class Practice01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(j>=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
