package Arrays.Medium.MajorityElementInArray;

import java.util.HashMap;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() > (arr.length/2)){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
