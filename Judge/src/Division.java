import java.util.Scanner;
public class Division {
public static void main(String[] args) {
	System.out.println("�������һ������a");
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	System.out.println("������ڶ�������a");
	int b = input.nextInt();
	if(b%a == 0|| a+b>1000){
		
		System.out.println("a��ֵ�ǣ�"+a);
		
	}
		else
			{
			System.out.println("b��ֵ�ǣ�"+b);
		}
	
	}
}
