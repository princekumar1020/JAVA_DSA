package Arrays.Medium.MaximumSubarraySumInArray;

public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                int sum=0;
                for(int z=i;z <= j;z++){
                    sum+=arr[z];
                }
                if(sum > max) max=sum;
            }
        }
        System.out.println(max);
    }
}
