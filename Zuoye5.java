import java.util.Scanner;

public class Zuoye5{
	/*根据控制台输入的成绩做判断，如下：  
	score >100 或 score<0 输出”super man“  
	score >=90 且 score<=100 输出”优秀“  
	score >=80 且 score<90 输出”良好“  
	score <80 输出”不及格“ */
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.println("super man");
		}else if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score<=90){
			System.out.println("良好");
		}else{
			System.out.println("不及格");
		}
	}
}