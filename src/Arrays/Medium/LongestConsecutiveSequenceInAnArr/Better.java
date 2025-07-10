package Arrays.Medium.LongestConsecutiveSequenceInAnArr;

import java.util.Arrays;
//Intution:
// 1)  sort the array
// 2) just store lastsmall and at start initalize to int minimum
// 3) check current element-1 is equal to min element .if yes count++
// and then update count by one and lastsmall element
// 4) if the arr[i] == lastsmall then just go to next element
// 5) if arr[i] is not equal to lastsmall element so just our sequence
// startnew from there and count = 1 and update lastsamll and continue
public class Better {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,4,100,100,101,101,102};
        Arrays.sort(arr);
        int max=1;
        int lastsmall=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]-1 == lastsmall){
                count++;
                lastsmall=arr[i];
            } else if (arr[i] != lastsmall) {
                count=1;
                lastsmall=arr[i];
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
