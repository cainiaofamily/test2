import java.util.Scanner;
public class Division {
public static void main(String[] args) {
	System.out.println("请输入第一个数字a");
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	System.out.println("请输入第二个数字a");
	int b = input.nextInt();
	if(b%a == 0|| a+b>1000){
		
		System.out.println("a的值是："+a);
		
	}
		else
			{
			System.out.println("b的值是："+b);
		}
	
	}
}
