package Arrays.Easy.LongestSubArrayWithSumK.OnlyPositive;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        int max=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
               sum+=arr[j];
               if(sum == k) max=Math.max(max,j-i+1);
            }
        }
        System.out.println(max);
    }
}
