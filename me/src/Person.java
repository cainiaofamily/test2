import java.util.Scanner;
public class Person {
public static void main(String[] args) {
	System.out.println("Please input your name here:");
	Scanner input = new Scanner(System.in);
	String Name = (String) input.next();
	System.out.println("Please input your age here:");
	int age = input.nextInt();
	System.out.println("Please input your gender here:");
	String gender = input.next();	
	System.out.println("The computer recorded that ��");
	System.out.println("Your nanme is��"+Name);
	System.out.println("Your age is��"+age);
	System.out.println("Your gender is��"+gender);
}
}
