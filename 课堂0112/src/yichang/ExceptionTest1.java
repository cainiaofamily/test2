package yichang;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("���������a:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("�����뱻����b:");
		Scanner input1 = new Scanner(System.in);
		int b = input1.nextInt();
		try {
			@SuppressWarnings("unused")
			int result = a / b;
		} catch (ArithmeticException m) {
			System.out.println("��������޷�����");
		} finally {
			System.out.println("��ļ�������Ϊ" + a + "/" + b);
		}
	}
}
