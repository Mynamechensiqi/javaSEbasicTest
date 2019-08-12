/*
一个数如果恰好等于它的因子之和,这个数就成为"完数".
例如6=1+2+3.
编程:找出1000以内的所有完数
*/
public class Demo8{
	public static void main(String[] args){
		//遍历1000以内所有的数
		for(int i=1; i<1000; i++){
			int sum = 0;     //和
			for(int j=1; j<i; j++){
				if(i%j == 0){
					sum = sum + j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
		/*System.out.println("1000以内的完数有：");
		for(int num = 2; num < 1000; num++){
			int sum = 0;
			for(int i = 1; i < num; i++){
				if(num % i == 0){
					sum += i;
				}
			}
			if(sum == num){
				System.out.println(sum);
			}
		}*/

	}
}








