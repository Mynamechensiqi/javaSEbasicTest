import java.util.Scanner;

public class Zuoye6{
	/*ѭ�����տ���̨�����һ�����������������̨������������ǡ���������롱-1���˳�ѭ����*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������һ������");
			int a = sc.nextInt();
			if(a != -1){
				System.out.println("����������ǣ�" + a);
			}else{
				return;
			}
		}
		/*Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������һ������");
			int a = sc.nextInt();
			System.out.println("����������ǣ�" + a);
			if(a == -1){
				break;
			}
		}*/
	}
}