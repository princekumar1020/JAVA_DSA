package Arrays.Medium.MajorityElementInArray;

import java.util.HashMap;
import java.util.Map;

public class Better {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entery:map.entrySet()){
            if(entery.getValue() > arr.length/2 ){
                System.out.println(entery.getKey());
                break;
            }
        }
    }
}
