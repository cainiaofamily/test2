import java.util.Scanner;
public class TestSum {
		public static void main(String args[]){
			Scanner scanner= new Scanner(System.in);
			System.out.println("�������һ������");
			int a =scanner.nextInt();
			System.out.println("������ڶ�������");
			int b =scanner.nextInt();
			int c = a + b;
			int d = a - b;
			int e = a * b;
			int f = a / b;
			int g = a % b;			
			System.out.println("c=" + a + "+" + b + "=" + c  );
			System.out.println("d=" + a + "-" + b + "=" + d  );
			System.out.println("e=" + a + "*" + b + "=" + e  );
			System.out.println("f=" + a + "/" + b + "=" + f  );
			System.out.println("g=" + a + "%" + b + "=" + g  );
		}
}
