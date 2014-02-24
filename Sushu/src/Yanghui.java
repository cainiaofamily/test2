import java.util.Scanner;

public class Yanghui {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入杨辉三角的基数");
		int row = scanner.nextInt();
		// 二维数组的动态初始化
		int a[][] = new int[row][];
		for (int i = 0; i < row; i++) {
			a[i] = new int[i + 1];
		}
		// 二维数组的赋值
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 0 || j == 0 || j == a[i].length - 1)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}

		// 二维数组的输出
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

	// 通过方法得到格式化后的数字
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