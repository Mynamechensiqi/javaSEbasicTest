import java.util.*;
/**
���������ͱ���x���ж�x�Ƿ�Ϊż������Ϊż�������ڿ���̨�ϴ�ӡ���������ֵ��ż������  
����x�Ƿ�Ϊż�������Ҫ�ڿ���̨�����x��ֵ
*/
public class ControlDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ�����ͣ�");
		int a = sc.nextInt();
		if(a%2 == 0){
			System.out.print("�������ֵΪż��;"+a);
		}else{
			System.out.print(a);
		}
	}
}