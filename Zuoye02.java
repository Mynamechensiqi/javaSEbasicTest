import java.util.*;
/**
����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12
ע���ֽ����ּȿ����ȳ���ģҲ������ģ���
*/
public class Zuoye2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��0~1000����:");
		int a = sc.nextInt();
		int hundreds = a/100;
		int tens = a/10%10;
		int unit = a%10;
		System.out.print("��λ����Ϊ��"+(hundreds+tens+unit));
	}
}