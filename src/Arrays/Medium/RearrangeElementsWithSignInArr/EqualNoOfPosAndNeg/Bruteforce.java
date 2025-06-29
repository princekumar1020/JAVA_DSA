package Arrays.Medium.RearrangeElementsWithSignInArr.EqualNoOfPosAndNeg;

import java.util.ArrayList;
import java.util.Arrays;
// time complixity : o(n) + O(n) .
//space complexity :o(n)
public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={1,2,-3,-1,-2,3};
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int a:arr){
           if(a<0) neg.add(a);
           else pos.add(a);
        }
        for(int i=0;i<pos.size();i++){
            arr[2*i]= pos.get(i);
            arr[2*i+1]= neg.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
