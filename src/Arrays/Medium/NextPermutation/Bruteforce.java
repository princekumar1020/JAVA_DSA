package Arrays.Medium.NextPermutation;

import java.util.ArrayList;
import java.util.List;

public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={1,2,3};
//        int[] arr={1,3,2};
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean[] map=new boolean[arr.length];
        permutation(arr,ds,ans,map);
        for(List l:ans){
            System.out.println(l);
        }
    }
    static void permutation(int[] arr,ArrayList<Integer> ds,List<List<Integer>> ans,boolean[] map){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< arr.length;i++){
            if(!map[i]){
                ds.add(arr[i]);
                map[i]=true;
                permutation(arr,ds,ans,map);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
}
