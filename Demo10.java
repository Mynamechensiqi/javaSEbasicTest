/*
������1~100���ۼ�ֵ����Ҫ���������и�λΪ3����
*/
public class Demo10{
    public static void main(String[] args){
		int sum = 0;
	    for(int i=1; i<=100; i++){
			if(i%10 == 3){
				continue;
			}
			sum += i;
		}
		System.out.print(sum);
    }
}