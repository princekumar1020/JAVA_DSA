package Arrays.Medium.RotateArrayClockWise90deg;

import java.util.Arrays;
//TC : o(n^2)
//SC : o(1)
public class Optimal {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr[0].length;j++){
                if(i != j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            int start=0;
            int end=arr[0].length-1;
            while(start < end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
