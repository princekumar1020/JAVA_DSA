package Arrays.Hard.ThreeSumProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        HashSet<List<Integer>> set=new HashSet<>();
        int s=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == s){
                        List<Integer> list= Arrays.asList(arr[i],arr[j],arr[k]);
                        list.sort(null);
                        set.add(list);
                    }
                }
            }
        }
        for(List<Integer> l:set){
            System.out.println(l);
        }
    }
}
