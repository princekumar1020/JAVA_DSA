package Arrays.Medium.MaximumSubarraySumInArray;

public class Better {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int max=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                    sum+=arr[j];
                if(sum > max) max=sum;
            }
        }
        System.out.println(max);
    }
}
