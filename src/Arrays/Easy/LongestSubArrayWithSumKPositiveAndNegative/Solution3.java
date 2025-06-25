package Arrays.Easy.LongestSubArrayWithSumKPositiveAndNegative;

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
            // if dont put here this if condition then it will not
            // work when array contain zeros mean not give right ans
        }
        System.out.println(maxlen);

    }
}
