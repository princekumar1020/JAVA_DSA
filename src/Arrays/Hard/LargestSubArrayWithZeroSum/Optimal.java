package Arrays.Hard.LargestSubArrayWithZeroSum;

import java.util.HashMap;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={9, -3, 3, -1, 6, -5};
        long k=0;
        HashMap<Long,Integer> map=new HashMap<>();
        long sum=0;
        int maxlen=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(sum == k) maxlen=i+1;
            Long rem=sum-k;
            if(map.containsKey(rem)){
                maxlen=Math.max(i- map.get(rem),maxlen);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);

    }
}
