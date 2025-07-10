package Arrays.Medium.SetMatrixZeros;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[][] arr={
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {1,0,0,1}
        };
        // arr[0][...]
        // arr[...][0]
        int r=arr.length;
        int c=arr[0].length;
        int col0=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == 0){
                    if(j != 0){
                        arr[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                    arr[i][0]=0;
                }
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j] != 0){
                    if(arr[0][j] == 0 || arr[i][0] == 0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0] == 0){
            for(int j=0;j< c;j++){
                arr[0][j]=0;
            }
        }
        if(col0 == 0){
            for(int i=0;i< c;i++){
                arr[i][0]=0;
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
