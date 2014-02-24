
public class Change {
	public static void main(String args[]){
		
		int a =19;
		int b =89;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" +a);
		System.out.println("b=" + b);
		
		int i =1;
		int j =2;
		i = i++ + j++;
		System.out.println("i="+i);				
	}
}
