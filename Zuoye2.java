import java.util.Scanner;

public class Zuoye2{
	/*实现函数计算：y = f（x） = x^2 - 2x + 4 注：x^2 表示“x 的平方” */
	public static void main(String[] args){
		int x = 1;
		int y = f(x);
		System.out.print(y);
	}
	public static int f(int x){
		int y = x^2 - 2*x + 4;
		return y;
	}
}