/*
冒泡排序
*/
public class Demo11{
    public static void main(String[] args){
        int sum[] = {13,64,84,27,26};
        for (int j=0; j < sum.length-1; j++){
            for (int i=0; i < sum.length-1-j; i++){
                if (sum[i] < sum[i+1]){
                    int h = sum[i];
                    sum[i] = sum[i+1];
                    sum[i+1] = h;
                }
            }
        }
        for (int i=0; i <= sum.length-1; i++){
            System.out.println(sum[i]);

        }
    }
}