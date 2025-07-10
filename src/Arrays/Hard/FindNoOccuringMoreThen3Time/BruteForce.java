package Arrays.Hard.FindNoOccuringMoreThen3Time;

import java.util.ArrayList;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count > (arr.length/3)){
                if(list.size() == 0 || list.get(list.size()-1) != arr[i]){
                    list.add(arr[i]);
                    if(list.size() == 2)break;
                }
            }
        }
        System.out.println(list);
    }
}
