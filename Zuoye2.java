import java.util.Scanner;

public class Zuoye2{
	/*ʵ�ֺ������㣺y = f��x�� = x^2 - 2x + 4 ע��x^2 ��ʾ��x ��ƽ���� */
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