import java.util.*;
/**
��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���.
*/
public class Zuoye1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���������a1:");
		int a = sc.nextInt();
		System.out.print("���������b1:");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.print("a2="+a+";b2="+b);
	}
}