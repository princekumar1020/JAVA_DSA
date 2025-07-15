package Arrays.Hard.FindOneMissingAndOneRepeatingElement;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4,6,7,5};
        int n= arr.length;
        int missing=Integer.MIN_VALUE;
        int repeating=Integer.MIN_VALUE;
        for(int i=1;i<= n;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(i == arr[j]) count++;
            }
            if(count == 2){
                repeating=i;
            } else if (count == 0) {
                missing=i;
            }
        }
        System.out.println("["+repeating+","+missing+"]");
    }
}
