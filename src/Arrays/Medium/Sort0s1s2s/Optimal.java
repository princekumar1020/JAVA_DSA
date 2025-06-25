package Arrays.Medium.Sort0s1s2s;

import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0) {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
                // dont inc mid becouse wee dont know the no coming
                // from high is whether 0 or 1.
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
