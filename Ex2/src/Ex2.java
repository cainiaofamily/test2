import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("�������������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num <= 500 && num > 0) {
			System.out.println("�ÿͻ���Ҫ���ɸ�������˰����Ϊ��" + "1");
			System.out.println("�ÿͻ���Ҫ���ɵĸ�������˰Ϊ��" + (0.05 * num));
		} else if (num <= 2000) {
			System.out.println("�ÿͻ���Ҫ���ɸ�������˰����Ϊ��" + "2");
			System.out.println("�ÿͻ���Ҫ���ɵĸ�������˰Ϊ��" + (0.1 * num));
		} else if (num <= 5000) {
			System.out.println("�ÿͻ���Ҫ���ɸ�������˰����Ϊ��" + "3");
			System.out.println("�ÿͻ���Ҫ���ɵĸ�������˰Ϊ��" + (0.15 * num));
		} else if (num <= 20000) {
			System.out.println("�ÿͻ���Ҫ���ɸ�������˰����Ϊ��" + "4");
			System.out.println("�ÿͻ���Ҫ���ɵĸ�������˰Ϊ��" + (0.2 * num));
		} else if (num > 20000) {
			System.out.println("�ÿͻ���Ҫ���ɸ�������˰����Ϊ��" + "5");
			System.out.println("�ÿͻ���Ҫ���ɵĸ�������˰Ϊ��" + (0.25 * num));
		} else {
			System.out.println("�������벻��ȷ�������½���ϵͳ�����������룡");
		}

	}
}
