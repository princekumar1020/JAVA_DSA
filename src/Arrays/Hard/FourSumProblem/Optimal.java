package Arrays.Hard.FourSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        int t=9;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j=i+1;j< arr.length;j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                int k=j+1;
                int l= arr.length-1;
                while(k < l){
                    long sum=arr[i]+arr[j];
                    sum+=arr[k];
                    sum+=arr[l];
                    if(sum == t){
                        List<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        ans.add(list);
                        k++;
                        l--;
                        while(k<l && arr[k] == arr[k-1]) k++;
                        while(k<l && arr[l] == arr[l+1]) l--;

                    } else if (sum < t) {
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }
        for(List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
