import java.util.*;
/**
���������ͱ���x��y�����ڿ���̨�����x��y��ֵ�ϴ���Ǹ�����
*/
public class ControlDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������x��");
		int x = sc.nextInt();
		System.out.print("������һ������y��");
		int y = sc.nextInt();
		if(x>y){
			System.out.print(x);
		}else{
			System.out.print(y);
		}
	}		
}