/**
����1+2+3+��+100�ĺͣ���ʾ����while��䣩  
�����1��100������������ӣ���ʾ����while��䣩  
��do while ѭ������д1�ӵ�100
*/
public class ControlDemo3{
	public static void main(String[] args){
		//����1+2+3+��+100�ĺ�
		int i1 = 1;
		int sum1 = 0;
		while(i1 <= 100){
			sum1 += i1;
			i1 ++;
		}
		System.out.print("1+2+3+��+100�ĺ�Ϊ��"+sum1);
		System.out.println();
		//�����1��100�������������
		int i2 = 1;
		int sum2 = 0;
		while(i2 <= 100){
			if(i2 % 2 == 0){
				sum2 += i2;
			}
			i2 ++;
		}
		System.out.print("1��100������������Ӻ�Ϊ��"+sum2);
		System.out.println();
		//��do while ѭ������д1�ӵ�100
		int i3 = 1;
		int sum3 = 0;
		do{
			sum3 += i3;
			i3 ++;
		}while(i3 <= 100);
		System.out.print("1�ӵ�100�ĺ�Ϊ��"+sum3);
	}
}