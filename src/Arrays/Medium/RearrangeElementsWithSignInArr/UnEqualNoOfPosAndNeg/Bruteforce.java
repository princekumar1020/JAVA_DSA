package Arrays.Medium.RearrangeElementsWithSignInArr.UnEqualNoOfPosAndNeg;

import java.util.ArrayList;
import java.util.Arrays;
// now here fall back to brute force method in done in above folder

public class Bruteforce {
    public static void main(String[] args) {
        int[] arr={1,2,-4,-5,3,6};
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int a:arr){
            if(a<0) neg.add(a);
            else pos.add(a);
        }
        if(neg.size() < pos.size()){
            for(int i=0;i< neg.size();i++){
                arr[2*i]= pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size();i< pos.size();i++){
                arr[index++]= pos.get(i);
            }
        }
        else{
            for(int i=0;i< pos.size();i++){
                arr[2*i]= pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size();i< neg.size();i++){
                arr[index++]= neg.get(i);
            }
        }
        System.out.println(Arrays.toString(arr));
        // one more ans by some guy after making neg and pos
//        int j = 0;
//        int p = pos.size(), n = neg.size();
//        for(int i=0;i<Math.max(p,n);i++){
//            if( i <p){
//                arr[j++] = pos.get(i);
//            }
//            if( i <n) arr[j++] = neg.get(i);
//        }
    }
}
