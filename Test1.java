import java.util.Scanner;
//�������У��Ӽ��˳����û�����
public class Test1{
	public static void main(String[] args){
		double value1 = sumPlus();
		System.out.print("���Ϊ��"+value1);
	}
	public static double sumPlus(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		double value1 = sc.nextDouble();
		System.out.print("������ڶ������֣�"); 
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
	
