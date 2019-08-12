import java.util.*;
/**
已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序.
*/
public class Zuoye1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入变量a1:");
		int a = sc.nextInt();
		System.out.print("请输入变量b1:");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.print("a2="+a+";b2="+b);
	}
}