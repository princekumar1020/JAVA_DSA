package Arrays.Medium.MajorityElementInArray;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count > (arr.length/2)){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
