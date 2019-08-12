/*

* * * * * * * * * * *  
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 
*                   * 
* * * * * * * * * * * 
 
*/
public class Demo3{
	public static void main(String[] args){
		int m,n;  //外框行和列
		int i,j;  //内部行和列
		m=n=11;
		for(i=0; i<m; i++){
			if(i==0 || i==m-1){
				for(j=0; j<n; j++){
					System.out.print("* ");
				}
			}else{
				System.out.print("* ");
				for(j=0; j<n-2; j++){
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}








