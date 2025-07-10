package Arrays.Medium.RotateArrayClockWise90deg;

import java.util.Arrays;
//TC : o(n^2)
//SC : o(n^2)

public class Bruteforce {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int r= arr.length;
        int c=arr[0].length;
        int[][] ans =new int[r][c];
        for(int i=0;i< r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[c-j-1][i];
            }
        }
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
