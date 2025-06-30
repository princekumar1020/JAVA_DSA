package Arrays.Medium.LeadersInAnArray;

import java.util.ArrayList;

public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(arr[i]);
            }
        }
//        list.add(arr[arr.length-1]);
        System.out.println(list);
    }
}
