import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//����(.��ʾ����һ���ַ�  \��Ԫ�ַ�����Ϊ��ͨ�ַ�)
		System.out.print("�������������ʽ��");
		Pattern pattern = Pattern.compile(scanner.nextLine());
		System.out.print("������Ҫƥ����ַ���");
		Matcher matcher = pattern.matcher(scanner.nextLine());//ƥ��
		boolean found = false;
		while (matcher.find()) {
			System.out.println("ƥ�䵽" + matcher.group() + "\" ��ʼ�� "
					+ matcher.start() + " ������ " + matcher.end() + ".");
			found = true;
		}
		if (!found) {
			System.out.println("ûƥ�䵽��");
		}
	}
}
