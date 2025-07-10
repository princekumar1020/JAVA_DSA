package Arrays.Easy.LongestSubArrayWithSumKPositiveAndNegative;

import java.util.HashMap;
// it will only work if there are only positive array and zeros
//TC :- o(2*n)
//Sc :- o(1)
public class Soluiton4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,3};
        int k=6;
        int max=0;
        long sum=arr[0];
        int right=0,left=0;
        while(right < arr.length){
            while(sum > k && left <= right){
                sum-=arr[left];
                left++;
            }
            if(sum == k){
                max=Math.max(max,right-left+1);
            }
            right++;
            if(right < arr.length) sum+=arr[right];

        }
        System.out.println(max);

    }
}
