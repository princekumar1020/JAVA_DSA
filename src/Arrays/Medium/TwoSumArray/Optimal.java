package Arrays.Medium.TwoSumArray;
import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
// only work for varity 1 problem means telling yes/not target exist or not
        int[] arr={2,6,5,8,11};
        int t=14;
//       after sorting array
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        boolean found=false;
        while(i < j){
            if(arr[i] + arr[j] == t){
                System.out.println("yes");
                found=true;
                break;
            } else if (arr[i] + arr[j] < t) {
                i++;
            }
            else{
                j--;
            }
        }
        if(!found){
            System.out.println("no");
        }
    }
}
