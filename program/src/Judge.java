import java.util.Scanner;

//�������㣨�жϣ�
public class Judge {

	public static void main(String args[]) {
		System.out.println("Please enter your number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		char isHigh = num > 100 ? (char) 'Y' : 'N';
		System.out.println("is more then 100?\n" + isHigh);
	}
}
