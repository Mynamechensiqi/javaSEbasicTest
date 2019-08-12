import java.util.*;

public class Test4{
/*验证码条码共13位，代表了一件商品编码，前12位（692116851128）有具体代表含义，第13位是通过如下步骤算出来的：  
第1步：取出该数的奇数位和，c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20 
第2步：取出该数的偶数位和，c2 = 9 + 1 + 6 + 5 + 1 + 8=30   第3步：将"奇数和"和"偶数和的三倍"相加cc=c1+c2*3=20+30*3=110  
第4步：取结果的个位数（对10取余）：110的个位数为（110%10=0） 
第5步：用 10 减去这个个位数：10 - 0 = 10  
第6步：对得到的数再取个位数（对 10 取余）：10%10=0 */ 

	public static void main(String[] args){
		//692116851128
		String num = "692116851128";
		//奇数
		int oldNum = 0;
		//偶数
		int evenNum = 0;
		for(int i = 0; i < num.length(); i++){
			if(i%2==0){
				oldNum += num.charAt(i)-'0';
			}else{
				evenNum += num.charAt(i)-'0';
			}
		}
		System.out.println("奇数位和："+oldNum);
		System.out.println("偶数位和："+evenNum);
		
		//将"奇数和"和"偶数和的三倍"相加cc=c1+c2*3=20+30*3=110 
		int total = oldNum + evenNum*3;
		System.out.println("相加最后的和为："+total);
		
		//取结果的个位数（对10取余）：110的个位数为（110%10=0）
		int units = total%10;
		System.out.println("结果的个位数为："+units);
		
		//用 10 减去这个个位数：10 - 0 = 10 
		int a = 10 - units;
		System.out.println("10减去这个个位数="+a);
		
		//对得到的数再取个位数（对 10 取余）：10%10=0 
		
		int b = a%10;
		System.out.println("上面数字的的个位数为："+b);
	}
}













