package Arrays.Hard.ThreeSumProblem;

import java.util.*;

public class Better {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j< arr.length;j++){
                int k=-(arr[i] + arr[j]);
                if(hashset.contains(k)){
                    List<Integer> list= Arrays.asList(arr[i],arr[j],k);
                    list.sort(null);
                    ans.add(list);
                }
                hashset.add(arr[j]);
            }
        }
        for(List<Integer> l:ans){
            System.out.println(l);
        }
    }
}
