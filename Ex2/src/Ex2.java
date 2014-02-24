import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("请输入月收入金额：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num <= 500 && num > 0) {
			System.out.println("该客户需要交纳个人所得税级别为：" + "1");
			System.out.println("该客户需要交纳的个人所得税为：" + (0.05 * num));
		} else if (num <= 2000) {
			System.out.println("该客户需要交纳个人所得税级别为：" + "2");
			System.out.println("该客户需要交纳的个人所得税为：" + (0.1 * num));
		} else if (num <= 5000) {
			System.out.println("该客户需要交纳个人所得税级别为：" + "3");
			System.out.println("该客户需要交纳的个人所得税为：" + (0.15 * num));
		} else if (num <= 20000) {
			System.out.println("该客户需要交纳个人所得税级别为：" + "4");
			System.out.println("该客户需要交纳的个人所得税为：" + (0.2 * num));
		} else if (num > 20000) {
			System.out.println("该客户需要交纳个人所得税级别为：" + "5");
			System.out.println("该客户需要交纳的个人所得税为：" + (0.25 * num));
		} else {
			System.out.println("您的输入不正确，请重新进入系统输入您的收入！");
		}

	}
}
