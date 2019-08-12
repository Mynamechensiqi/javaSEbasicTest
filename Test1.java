import java.util.Scanner;
//计算器中，加减乘除，用户输入
public class Test1{
	public static void main(String[] args){
		double value1 = sumPlus();
		System.out.print("结果为："+value1);
	}
	public static double sumPlus(){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		double value1 = sc.nextDouble();
		System.out.print("请输入第二个数字："); 
		double value2 = sc.nextDouble(); 
		return value1*value2;
	}
	//////
	public static int sumMinus(int a,int b){
		int sum2 = a - b;
		return sum2;
	}
	public static int sumRide(int a,int b){
		int sum3 = a * b;
		return sum3;
	}
	public static int sumExcept(int a,int b){
		int sum4 = a / b;
		return sum4;
	}
}
	
