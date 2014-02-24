import java.util.Scanner;

public class RunNian {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner number = new Scanner(System.in);
		int year = number.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This year is a leap year!");
		} else {
			System.out.println("This year is not a leap year!");
		}

	}
}
