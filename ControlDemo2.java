import java.util.*;
/**
有两个整型变量x，y，请在控制台上输出x与y中值较大的那个数。
*/
public class ControlDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整型x：");
		int x = sc.nextInt();
		System.out.print("请输入一个整型y：");
		int y = sc.nextInt();
		if(x>y){
			System.out.print(x);
		}else{
			System.out.print(y);
		}
	}		
}