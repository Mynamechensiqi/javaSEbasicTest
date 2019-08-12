/**
用for循环来改写1加到100  
用for循环改写从1到100的所有奇数相加的和
*/
public class ControlDemo4{
	public static void main(String[] args){
		int sum1 = 0;
		for(int i1=1; i1<=100; i1++){
			sum1 += i1;
		}
		System.out.print("1加到100："+sum1);
		System.out.println();
		int sum2 = 0;
		for(int i2=1; i2<=100; i2++){
			if(i2 % 2 == 1){
				sum2 += i2;
			}
		}
		System.out.print("1到100的所有奇数相加的和："+sum2);
	}
}