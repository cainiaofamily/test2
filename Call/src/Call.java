import java.util.Scanner;
public class Call {
public static void main(String[] args) {
	System.out.println("�����벦�Ŵ��룺");
	Scanner input = new Scanner(System.in);
	int callNum = input.nextInt();
	switch(callNum){
	case 1:
	System.out.println("����Ϊ�����������׵ĺ���...");
	break;
	case 2:
		System.out.println("����Ϊ��������ĸ�׵ĺ���...");
		break;
	case 3:
		System.out.println("����Ϊ��������үү�ĺ���...");
		break;
	case 4:
		System.out.println("����Ϊ�����������̵ĺ���...");
		break;
	default:
		System.out.println("ѡ�񲻶ԣ�����ѡ����Ҫ�������ı�ţ�");
	}
}
}
