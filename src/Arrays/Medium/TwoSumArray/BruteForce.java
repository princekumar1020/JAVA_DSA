package Arrays.Medium.TwoSumArray;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int t=14;
        boolean found=false;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] + arr[j] == t){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
