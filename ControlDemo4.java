/**
��forѭ������д1�ӵ�100  
��forѭ����д��1��100������������ӵĺ�
*/
public class ControlDemo4{
	public static void main(String[] args){
		int sum1 = 0;
		for(int i1=1; i1<=100; i1++){
			sum1 += i1;
		}
		System.out.print("1�ӵ�100��"+sum1);
		System.out.println();
		int sum2 = 0;
		for(int i2=1; i2<=100; i2++){
			if(i2 % 2 == 1){
				sum2 += i2;
			}
		}
		System.out.print("1��100������������ӵĺͣ�"+sum2);
	}
}