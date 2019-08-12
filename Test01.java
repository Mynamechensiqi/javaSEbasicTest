/**
.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
*/
public class Test1{
	public static void main(String[] args){
		int cock = 5;
		int hen = 3;
		int chick = 1/3;
		int a,b,c;
		for(int a;a<100;a++){
			for(int b; b<100; b++){
				for(int c; c<100; c++){
					double money = 5*a + 3*b + 1/3*c;
					if(money == 100){
						
					}
				}
			}
		}
		System.out.print(a+";"+b+";"+c);
	}
}