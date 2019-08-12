import java.util.*;
/**
给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
注：分解数字既可以先除后模也可以先模后除
*/
public class Zuoye2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个0~1000数字:");
		int a = sc.nextInt();
		int hundreds = a/100;
		int tens = a/10%10;
		int unit = a%10;
		System.out.print("各位数和为："+(hundreds+tens+unit));
	}
}