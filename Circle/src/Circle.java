import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		System.out.println("Please input the radius of a circle:");
		Scanner input = new Scanner(System.in); 
		double �� = 3.14;
		Float r = input.nextFloat();
		//���ʹ��int���ͣ�ֻ�����������������ǰ뾶�п��ܲ�������
		int C =(int) (2*��*r);//ǿ������ܳ�Ϊint����
		double S =��*r*r;
		//����int S =(int) (��*r*r)S������double���͵ģ�Ҳ����ת��Ϊint����
		System.out.println("��Բ���ܳ�Ϊ��C="+2+"*"+��+"*"+r+"="+C);
		//���������
		//System.out.println("��Բ���ܳ�Ϊ��C="+(2*��*r)+C);
		//�����С��
		System.out.println("��Բ�����Ϊ��S="+��+"*"+r+"*"+r+"="+S);
		//System.out.println("��Բ�����Ϊ��S="+(��*r*r)+S);
	}
}
