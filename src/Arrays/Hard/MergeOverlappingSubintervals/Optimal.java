package Arrays.Hard.MergeOverlappingSubintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Optimal {
    public static void main(String[] args) {
        int[][] arr={
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }
        for(List<Integer> l:ans){
            System.out.println(l);
        }
    }
}
