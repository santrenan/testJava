package repetitive_structure;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count = 0;
		while (x != 0) {
			count += x;
			x = sc.nextInt();
		}
		
		System.out.printf("%nResult = %d", count);
		sc.close();
	}
}
