package Arrays.Easy;

import java.util.*;
public class Practice {
    public static void main(String[] args) {
       int[] arr={1,1,1,3,3,2,2,2};
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int a:arr){
           map.put(a, map.getOrDefault(a,0)+1);
           if(map.get(a) > (arr.length/3)){
               System.out.print(a+" ");
           }
       }
//       for(Map.Entry<Integer,Integer> e: map.entrySet()){
//           if(e.getValue() > (arr.length/3)){
//               System.out.print(e.getKey()+" ");
//           }
//       }
    }
}
