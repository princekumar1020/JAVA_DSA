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
            if(sum == k) maxlen=i+1;
// if we just update here maxlen then it will work for only +ve so we
// have to write here  maxLen = Math.max(maxLen, i + 1); kyo kiya agar
// arr +ve -ve contain kar rha ha to kya pta jo sum ab eqaul aya ha wo
//kabhi aga ja ka fir negative ho sakta ha to fir wo uski max length ho gi
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
