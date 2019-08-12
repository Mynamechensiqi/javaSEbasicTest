import java.util.Scanner;

public class Zuoye3{
	/*实现 2 个函数计算：
		1) y = f（x） = x%3
		2) y = f（x） = x++ 
		  (b = x（a） = a++) */
	public static void main(String[] args){
		int x = 5;
		int y = f(x);
		System.out.println(y);
		
		int a = 3;
		int b = x(a);
		System.out.println(b);
	}
	public static int f(int x){
		int y = x%3;
		return y;
	}
	public static int x(int a){
		int b = a++;
		return b;
	}
}
	