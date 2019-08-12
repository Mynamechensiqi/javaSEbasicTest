/*
现在给出两个数组: 
数组A：{1,7,9,11,13,15,17,19}
数组B：{2,4,6,8,10}
两个数组合并为数组c,按升序排列  
*/
import java.util.*;
public class Demo6{
	public static void main(String[] args){
		int[] A = {1,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10};
		int[] C = new int[A.length+B.length];
		int sum = 0;
		for(int i=0; i<A.length; i++){
			C[i] = A[i];
		}
		for(int i=0; i<B.length; i++){
			C[A.length+i] = B[i];
		}
		for(int i=0; i<C.length; i++){
			for (int m = 0; m < C.length - 1; m++) {
				if (C[m] < C[m + 1]) {
					int h = C[m];
					C[m] = C[m + 1];
					C[m + 1] = h;
				}
			}	
		}
		System.out.println(Arrays.toString(C));
	}
}