import java.util.*;
/**
企业发放的奖金根据利润提成。
利润低于或等于10万元时，奖金可提10%；
利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；
高于20万，低于或等于40万时，高于20万元的部分，可提成5%；
高于40万，低于或等于60万时，高于40万元的部分，可提成3%；
高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，
高于100万元时，超过100万元的部分按1%提成，
在程序中设定一个变量为当月利润，求应发放奖金总数？
*/
public class ZuoyeDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的奖金(单位:万元)：");
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