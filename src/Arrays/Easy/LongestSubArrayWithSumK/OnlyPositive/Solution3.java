package Arrays.Easy.LongestSubArrayWithSumK.OnlyPositive;

import java.util.HashMap;
// reverse mathamatics
public class Solution3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        Long k=3L;
        HashMap<Long,Integer> map=new HashMap<>();
        Long sum=0L;
        int maxlen=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(sum == k) maxlen=i+1; //only for +ves
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
