package Arrays.Medium.LeadersInAnArray;

import java.util.ArrayList;
//TC : o(n)
// SC: o(n) not to solve just to return
public class Optimal {
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> list=new ArrayList<>();
        int greater=Integer.MIN_VALUE;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i] > greater){
                list.add(arr[i]);
            }
            greater=Math.max(greater,arr[i]);
        }
        System.out.println(list);
        // if we have to ask to sort then sort it and return
        // if we have to give ans from start arr then rev it and return
    }
}
