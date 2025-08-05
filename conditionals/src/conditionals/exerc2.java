package conditionals;

import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day of the week is it?");
		int x = sc.nextInt();
		String day;
		
		
		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
		}
		
		System.out.printf("Week day: %s", day);
		
		sc.close();
		
	}

}
