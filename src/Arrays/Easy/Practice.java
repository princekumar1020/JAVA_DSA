package Arrays.Easy;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
        int i=0;
        for(int j=i+1;j< arr.length;j++){
            if(arr[j] != arr[i]){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
}
