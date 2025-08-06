package repetitive_structure;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0, x = 0;
		
		for (int i=0; i<N; i++) {
			x = sc.nextInt();
			count += x;
		}
		
		System.out.printf("%nTotal = %d", count);
	}
}
