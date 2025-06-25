package Arrays.Medium.MaximumSubarraySumInArray;

public class Optimal {
    public static void main(String[] args) {
        // Kadane's Algorithm
// 1) just add to sum because ho sakta ha -ve no hi max ho pura arr ma
// sa
// 2)then update max is greater then prev max
// 3) -ve sum ka aga lajana ka koi faida nhi ha so dint take it and
// if it get below zero just update it to 0 sum=0
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< arr.length;i++){
           sum+=arr[i];
            if(sum > max){
                max=sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
