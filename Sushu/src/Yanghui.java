import java.util.Scanner;

public class Yanghui {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������ǵĻ���");
		int row = scanner.nextInt();
		// ��ά����Ķ�̬��ʼ��
		int a[][] = new int[row][];
		for (int i = 0; i < row; i++) {
			a[i] = new int[i + 1];
		}
		// ��ά����ĸ�ֵ
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 0 || j == 0 || j == a[i].length - 1)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}

		// ��ά��������
		for (int i = 0; i < row; i++) {
			for (int r = 0; r < (row - i + 1); r++) {
				System.out.print("  ");
			}
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(getFormatNum(a[i][j], a[row - 1][row / 2])
						+ " ");
			}
			System.out.println();
			System.out.println();
		}
	}

	// ͨ�������õ���ʽ���������
	private static String getFormatNum(int number, int maxNumber) {
		String currentString = String.valueOf(number);
		int maxDigits = String.valueOf(maxNumber).length();
		int currentDigits = String.valueOf(number).length();
		for (int i = 0; i < maxDigits - currentDigits; i++) {
			currentString = "0" + currentString;
		}
		return currentString;
	}
}