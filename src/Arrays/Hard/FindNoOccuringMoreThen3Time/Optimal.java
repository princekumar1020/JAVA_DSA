package Arrays.Hard.FindNoOccuringMoreThen3Time;

import java.util.ArrayList;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,2,2,2};
        ArrayList<Integer> list=new ArrayList<>();
        int cand1=Integer.MIN_VALUE,c1=0;
        int cand2=Integer.MIN_VALUE,c2=0;
        for(int a:arr){
            if(c1 == 0 && cand2 != a){
                cand1=a;
                c1=1;
            } else if (c2 == 0 && cand1 != a) {
                cand2=a;
                c2=1;
            } else if (a == cand1) {
                c1++;
            }
            else if (a == cand2) {
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int a:arr){
            if(cand1 == a){
                count1++;
            }
            if(cand2 == a){
                count2++;
            }
        }
        if(count1 > (arr.length/3)){
            list.add(cand1);
        }
        if(count2 > (arr.length/3)){
            list.add(cand2);
        }
        System.out.println(list);
    }
}
