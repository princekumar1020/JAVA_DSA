package Arrays.Easy;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};
// Brute force: take a visited boolean array add before adding to temp
// just check if its true  or false if false or 0 then add if its
// alrready taken means 0 or false then check next and if not there
// then next element ,
        ArrayList<Integer> temp=new ArrayList<>();
        int[] visit=new int[b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                 if (a[i] == b[j] && visit[j] == 0) {
                    temp.add(a[i]);
                    visit[j]=1;
                    break;
                }
                if(a[i] < b[j]){
                    break;
                }
            }
        }
// Optimal Approach:two pointers and put these conditions
//        int i=0,j=0;
//        while(i < a.length && j < b.length){
//            if (a[i] == b[j]){
//                temp.add(a[i]);
//                i++;
//                j++;
//            } else if (a[i] < b[j]) {
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
        System.out.println(temp);
    }
}
