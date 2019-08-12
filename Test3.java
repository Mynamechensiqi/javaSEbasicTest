public class Test3{
	public static void main(String[] args){
		int[] num1 = {1,4,7,8};
		int[] num2 = new int[num1.length];
		for(int i=0; i<num1.length;i++){
			num2[i] = num1[i];
		}
		System.out.println(num2[1]);
		num1[1] = 6;
		System.out.println(num1[1]);
		System.out.println(num2[1]);
	}
}