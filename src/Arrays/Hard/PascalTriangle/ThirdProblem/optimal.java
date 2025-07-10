package Arrays.Hard.PascalTriangle.ThirdProblem;

import java.util.ArrayList;
import java.util.List;

public class optimal {
    public static void main(String[] args) {
        int row=5;
        List<List<Integer>> finalans=new ArrayList<>();
        for(int i=1;i<=row;i++){
            finalans.add(printrow(i));
        }
        for(List a:finalans){
            System.out.println(a);
        }
    }
    static ArrayList<Integer> printrow(int row){
        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
}
