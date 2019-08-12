/**
计算1+2+3+…+100的和（提示利用while语句）  
计算从1到100的所有奇数相加（提示利用while语句）  
用do while 循环来改写1加到100
*/
public class ControlDemo3{
	public static void main(String[] args){
		//计算1+2+3+…+100的和
		int i1 = 1;
		int sum1 = 0;
		while(i1 <= 100){
			sum1 += i1;
			i1 ++;
		}
		System.out.print("1+2+3+…+100的和为："+sum1);
		System.out.println();
		//计算从1到100的所有奇数相加
		int i2 = 1;
		int sum2 = 0;
		while(i2 <= 100){
			if(i2 % 2 == 0){
				sum2 += i2;
			}
			i2 ++;
		}
		System.out.print("1到100的所有奇数相加和为："+sum2);
		System.out.println();
		//用do while 循环来改写1加到100
		int i3 = 1;
		int sum3 = 0;
		do{
			sum3 += i3;
			i3 ++;
		}while(i3 <= 100);
		System.out.print("1加到100的和为："+sum3);
	}
}