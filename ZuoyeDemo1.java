import java.util.*;
/**
��ҵ���ŵĽ������������ɡ�
������ڻ����10��Ԫʱ���������10%��
�������10��Ԫ�����ڻ����20��Ԫʱ������10��Ԫ�Ĳ��֣������7.5%��
����20�򣬵��ڻ����40��ʱ������20��Ԫ�Ĳ��֣������5%��
����40�򣬵��ڻ����60��ʱ������40��Ԫ�Ĳ��֣������3%��
����60�򣬵��ڻ����100��ʱ������60��Ԫ�Ĳ��֣������1.5%��
����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
�ڳ������趨һ������Ϊ����������Ӧ���Ž���������
*/
public class ZuoyeDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���������Ľ���(��λ:��Ԫ)��");
		double x = sc.nextDouble();
		double bonue = 0;
		if(x<=10){
			bonue = x + x*0.1;
		}else if(x>10 && x<=20){
			bonue = x + (x-10)*0.075;
		}else if(x>20 && x<=40){
			bonue = x + (x-20)*0.05;
		}else if(x>40 && x<=60){
			bonue = x + (x-40)*0.03;
		}else if(x>60 && x<=100){
			bonue = x + (x-60)*0.015;
		}else{
			bonue = x + (x-100)*0.01;
		}
		System.out.print(bonue);
	}
}