package Arrays.Medium.SetMatrixZeros;

import java.util.Arrays;
// TC: o(n*m)+o(n+m)  ~ o(2*n^2)
// SC : 0(n) + o(m)
// i will take two arr that is one row size and one of col size then
// when we triverse throught arr if 0 occure then mark that index in
// that  arr row as i and col as j 1 now triverse that row and col array
// first row array where there is one now take that row in arr and mark
// its entire cols as 0 now next take array of cols and mark that cols
// row to 0
public class Better {
    public static void main(String[] args) {
        int[][] arr={
                     {1,1,1,1},
                     {1,0,1,1},
                     {1,1,0,1},
                     {1,0,0,1}
        };
        int r= arr.length;
        int c=arr[0].length;
        int[] row=new int[r];
        int[] col=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == 0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i] == 1 || col[j] == 1) arr[i][j]=0;
            }
        }
//        for(int i=0;i<r;i++){
//            if(row[i] == 1){
//                for(int j=0;j<c;j++){
//                    arr[i][j]=0;
//                }
//            }
//        }
//        for(int i=0;i<c;i++){
//            if(col[i] == 1){
//                for(int j=0;j<r;j++){
//                    arr[j][i]=0;
//                }
//            }
//        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
