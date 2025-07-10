package Arrays.Medium.CountSubarraySumEqualsK;

public class Bruteforce {
    public static void main(String[] args) {
//        int[] arr={3, 1, 2, 4};
        int[] arr={-1,-1,1};
        int k=0;
        int count=0;
        for(int i=0;i< arr.length;i++){

            for(int j=i;j< arr.length;j++){
                int sum=0;
                for(int z=i;z<=j;z++){
                    sum+=arr[z];
                    System.out.print(sum+" ");
                }
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
