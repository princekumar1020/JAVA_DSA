package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,2,6,3,1,4};
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int a:arr){
            hash.put(a, hash.getOrDefault(a,0)+1);
        }
        
//        System.out.println(Arrays.toString(arr));
    }
}
