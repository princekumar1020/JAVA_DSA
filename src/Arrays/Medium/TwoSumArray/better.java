package Arrays.Medium.TwoSumArray;

import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        // koi bhi do no array ma sa not subarray koi bhi
        int[] arr={2,6,5,8,11};
        int t=14;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int exist=t-arr[i];
            if(map.containsKey(exist)){
                System.out.println(map.get(exist)+" "+i);
                break;
            }
                map.put(arr[i],i);
        }
    }
}
