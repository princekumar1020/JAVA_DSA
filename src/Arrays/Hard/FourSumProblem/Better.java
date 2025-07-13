package Arrays.Hard.FourSumProblem;

import java.util.*;

public class Better {
    public static void main(String[] args) {
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        int t=9;
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                HashSet<Long> set=new HashSet<>();
                for(int k=j+1;k< arr.length;k++){
                        long z=arr[i]+arr[j];
                        z+=arr[k];
                        z=t-z;
                        if(set.contains(z)){
                            List<Integer> l=new ArrayList<>();
                            l.add(arr[i]);
                            l.add(arr[j]);
                            l.add(arr[k]);
                            l.add((int)z);
                            l.sort(Integer::compareTo);
                            ans.add(l);
                        }
                        set.add((long)arr[k]);
                }
            }
        }
        for(List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
