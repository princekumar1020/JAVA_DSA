package Arrays.Medium.LongestConsecutiveSequenceInAnArr;

import java.util.Arrays;
import java.util.Map;

public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={102,4,100,1,101,3,2,1,1};
        int max=1;
        for(int i=0;i< arr.length;i++){
            int count=1;
            int x=arr[i];
            while(ls(arr,x+1)){
                count++;
                x=x+1;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);

    }
    static boolean ls(int[] arr,int x){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == x) return true;
        }
        return false;
    }
}
