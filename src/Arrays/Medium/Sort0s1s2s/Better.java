package Arrays.Medium.Sort0s1s2s;

import java.util.Arrays;

public class Better {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
        int zero=0,one=0,two=0;
        for(int a:arr){
            if(a == 0) zero++;
            else if (a==1) one++;
            else two++;
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<zero+one ;i++){
            arr[i]=1;
        }
        for(int i=zero+one;i< arr.length;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
