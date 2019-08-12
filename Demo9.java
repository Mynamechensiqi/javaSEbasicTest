/*
一个小球从100高度自由落下,每次落地后反跳回原高度的一半,再落下，
求它在第十次落地时,共经过多少米?第10次反弹多高?
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











