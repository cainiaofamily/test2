package yichang;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("请输入除数a:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("请输入被除数b:");
		Scanner input1 = new Scanner(System.in);
		int b = input1.nextInt();
		try {
			@SuppressWarnings("unused")
			int result = a / b;
		} catch (ArithmeticException m) {
			System.out.println("程序出错，无法计算");
		} finally {
			System.out.println("你的计算内容为" + a + "/" + b);
		}
	}
}
