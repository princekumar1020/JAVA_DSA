package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collection;
// bas ya yad rakho hma har step pa update karna ha lcount ko
public class MaximumConsicutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1};
        int count=0;
        int lcount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
            else {
                count=0;
            }
            lcount = Math.max(lcount, count);
        }
        System.out.println(lcount);

    }
}
