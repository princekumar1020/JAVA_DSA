package Arrays.Easy;

import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int[] arr={-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,0,0,0,0,0,2,2,2,2,2};
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int start=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != start){
                start=arr[i];
                int j=i+1;
                int k= arr.length-1;
                while(j<k){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> l=Arrays.asList(arr[i],arr[j],arr[k]);
                        ans.add(l);
                        int left=arr[j];
                        while(j<k && arr[i] == left){
                            j++;
                        }
                        int right=arr[k];
                        while(j<k && arr[k] == right){
                            k--;
                        }
                    } else if (arr[i]+arr[j]+arr[k] < 0) {
                        j++;
                    }
                    else {
                        k--;
                    }
                }
            }
        }
        for (List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
