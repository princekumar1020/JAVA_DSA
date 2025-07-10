package Arrays.Hard.PascalTriangle.ThirdProblem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=1;j<=i;j++){
                list.add(findelement(i-1,j-1));
            }
            ans.add(list);
        }
        for(List a:ans){
            System.out.println(a);
        }
    }
    static int findelement(int n,int r){
        int fact=1;
        for(int i=0;i<r;i++){
            fact=fact*(n-i);
            fact=fact/(i+1);
        }
        return fact;
    }
}
