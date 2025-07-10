package Arrays.Medium.CountSubarraySumEqualsK;

public class Better {
    public static void main(String[] args) {
        int[] arr={-1,-1,1};
        int k=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                sum+=arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
