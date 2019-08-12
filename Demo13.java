public class Demo13{
	public static void main(String[] args){
		String num = "123456789012";
		int oldNum = 0;
		int evenNum = 0;
		for(int i=0; i < num.length(); i++){
			if(i%2==0){
				oldNum += num.charAt(i)-'0';
			}else{
				evenNum += num.charAt(i)-'0';
			}
		}
		System.out.println("奇数位和："+oldNum);
		System.out.println("偶数位和："+evenNum);
	}
}