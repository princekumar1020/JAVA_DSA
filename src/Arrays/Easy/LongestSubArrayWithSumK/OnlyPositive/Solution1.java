package Arrays.Easy.LongestSubArrayWithSumK.OnlyPositive;
// subarry means contiguous part of array

public class Solution1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
//        int[] arr={2,3,5,1,9};
        int k=3;
        int max=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                int sum=0;
                int count=0;
                for(int z=i;z<=j;z++){
                    sum+=arr[z];
                    count++;
                }
                if(sum == k){
                    max=Math.max(max,count);
                }
            }
        }
        System.out.println(max);
    }
}
