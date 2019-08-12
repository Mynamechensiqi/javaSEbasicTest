import java.util.*;
/**
假设有整型变量x，判断x是否为偶数，若为偶数，则在控制台上打印“输入的数值是偶数”。  
无论x是否为偶数，最后都要在控制台上输出x的值
*/
public class ControlDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整型：");
		int a = sc.nextInt();
		if(a%2 == 0){
			System.out.print("输入的数值为偶数;"+a);
		}else{
			System.out.print(a);
		}
	}
}