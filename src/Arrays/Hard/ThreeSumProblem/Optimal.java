package Arrays.Hard.ThreeSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int prei=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != prei){
                int j=i+1;
                int k= arr.length-1;
                while ( j< k){
                    if(arr[i] + arr[j] +arr[k] == 0){
//                    store
                        List<Integer> l= Arrays.asList(arr[i],arr[j],arr[k]);
                        ans.add(l);
                        int prej=arr[j];
                        int prek=arr[k];
                        while (j<k && arr[j] == prej){
                            j++;
                        }
                        while ( j<k  && arr[k] == prek){
                            k--;
                        }
                    } else if (arr[i]+arr[j]+arr[k] < 0) {
                        j++;
                    }
                    else{
                        k--;
                    }
                }
                prei=arr[i];
            }
        }
        for (List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
