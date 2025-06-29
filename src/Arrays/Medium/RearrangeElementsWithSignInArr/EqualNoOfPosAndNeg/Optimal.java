package Arrays.Medium.RearrangeElementsWithSignInArr.EqualNoOfPosAndNeg;

import java.util.Arrays;
//TC:- o(N)
// SC:- o(N)
public class Optimal {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
//        int[] arr={1,2,-3,-1,-2,3};
        int[] ans=new int[arr.length];
        int n=0,p=0;
        for(int a:arr){
            if(a > 0){
                ans[2*p]=a;
                p++;
            }
            else{
                ans[2*n+1]=a;
                n++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
