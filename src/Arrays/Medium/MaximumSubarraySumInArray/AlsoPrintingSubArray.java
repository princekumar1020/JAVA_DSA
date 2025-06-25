package Arrays.Medium.MaximumSubarraySumInArray;

public class AlsoPrintingSubArray {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int end=-1;
        int s=-1;
        for(int i=0;i< arr.length;i++){
            if(sum == 0) start=i;
            sum+=arr[i];
            if(sum > max){
                start=s;
                end=i;
                max=sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        System.out.println(end);
    }
}
