/*
һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,�����£�
�����ڵ�ʮ�����ʱ,������������?��10�η������?
*/
public class Demo9{
    public static void main(String[] args){
		double heigth = 100;
		int num = 0;
		for(double sum=1; sum<=10; sum++){
			heigth = heigth/2;
			num += heigth*2;
		}
		System.out.println(num+100);
		double heigth2 = heigth/2;
		System.out.println(heigth2);
    }
}











