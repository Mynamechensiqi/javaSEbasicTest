import java.util.*;

/*en-13������֤���㣬��֤�����빲13λ��������һ����Ʒ���룬ǰ12λ��692116851128���о�������壬��13λ��ͨ�����²���������ģ�  
��1����ȡ������������λ�ͣ�c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20 
��2����ȡ��������ż��λ�ͣ�c2 = 9 + 1 + 6 + 5 + 1 + 8=30   ��3������"������"��"ż���͵�����"���cc=c1+c2*3=20+30*3=110  
��4����ȡ����ĸ�λ������10ȡ�ࣩ��110�ĸ�λ��Ϊ��110%10=0�� 
��5������ 10 ��ȥ�����λ����10 - 0 = 10  
��6�����Եõ�������ȡ��λ������ 10 ȡ�ࣩ��10%10=0 */ 
public class Demo12{

	public static void main(String[] args){
		String num = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		for(int i = 0; i < num.length(); i++){
			if(i%2==0){
				oldNum += num.charAt(i)-'0';
			}else{
				evenNum += num.charAt(i)-'0';
			}
		}
		System.out.println("����λ�ͣ�"+oldNum);
		System.out.println("ż��λ�ͣ�"+evenNum);
		int total = oldNum + evenNum*3;
		System.out.println("������ĺ�Ϊ��"+total);
		int units = total%10;
		System.out.println("����ĸ�λ��Ϊ��"+units);
		int a = 10 - units;
		System.out.println("10��ȥ�����λ��="+a); 
		int b = a%10;
		System.out.println("�������ֵĵĸ�λ��Ϊ��"+b);
	}
}














