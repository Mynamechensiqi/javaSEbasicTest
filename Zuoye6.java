import java.util.Scanner;

public class Zuoye6{
	/*循环接收控制台输入的一个数，并且输出控制台”您输入的数是“，如果输入”-1“退出循环。*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("请输入一个数：");
			int a = sc.nextInt();
			if(a != -1){
				System.out.println("您输入的数是：" + a);
			}else{
				return;
			}
		}
		/*Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("请输入一个数：");
			int a = sc.nextInt();
			System.out.println("您输入的数是：" + a);
			if(a == -1){
				break;
			}
		}*/
	}
}