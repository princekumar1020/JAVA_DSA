package Arrays.Hard.LargestSubArrayWithZeroSum;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={9, -3, 3, -1, 6, -5};
        int max=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                sum+=arr[j];
                if(sum == 0){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
