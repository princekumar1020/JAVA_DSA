package Arrays.Medium.SetMatrixZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// TC: o(n*m) *o(n+m) + 0(n*m)  ~ o(n^3)
// this will only work when there is no -1 already in matrix
// intution : first triversal through whole arr and then mark all
// element of that whole row and col as -1 except 0.
// again triverse throught the matrix and just replace -1 with 0
public class Bruteforce {
    public static void main(String[] args) {
        int[][] arr={{0,1,2,0}
                    ,{0,1,2,0},
                     {1,3,1,5}};
        int r= arr.length;
        int c=arr[0].length;
        for(int i=0;i< r;i++){
            for(int j=0;j< c;j++){
                if(arr[i][j] == 0){
                    for(int col=0;col<c;col++){
                        if(arr[i][col] != 0){
                            arr[i][col]=-1;
                        }
                    }
                    for(int row=0;row<r;row++){
                        if(arr[row][j] != 0){
                            arr[row][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == -1){
                    arr[i][j]=0;
                }
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
