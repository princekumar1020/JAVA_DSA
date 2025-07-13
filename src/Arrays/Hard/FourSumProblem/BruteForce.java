package Arrays.Hard.FourSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        int t=9;
        HashSet<List<Integer>> ans=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    for(int z=k+1;z<arr.length;z++){
                        long sum=arr[i]+arr[j];
                        sum+=arr[k];
                        sum+=arr[z];
                        if(sum == t){
                            List<Integer> l= Arrays.asList(arr[i],arr[j],arr[k],arr[z]);
                            l.sort(null);
                            ans.add(l);
                        }
                    }
                }
            }
        }
        for(List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
