import java.util.Scanner;

public class Zuoye4{
	/*ʹ����Ԫ�����ʵ�ַ�ҳ���ܡ� */
	public static void main(String[] args){
		int totalNumber = 136;
		int subNumber = 27;
		int pageNumber = 0;
		pageNumber = totalNumber%subNumber == 0 ? 
		totalNumber/subNumber : totalNumber/subNumber + 1;
		System.out.print(pageNumber);
	}
}