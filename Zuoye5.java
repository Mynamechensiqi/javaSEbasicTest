import java.util.Scanner;

public class Zuoye5{
	/*���ݿ���̨����ĳɼ����жϣ����£�  
	score >100 �� score<0 �����super man��  
	score >=90 �� score<=100 ��������㡰  
	score >=80 �� score<90 ��������á�  
	score <80 ����������� */
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.println("super man");
		}else if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80 && score<=90){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
	}
}