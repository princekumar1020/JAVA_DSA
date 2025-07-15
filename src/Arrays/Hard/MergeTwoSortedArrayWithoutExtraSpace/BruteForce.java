package Arrays.Hard.MergeTwoSortedArrayWithoutExtraSpace;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args) {
        int[] a={1,4,8,10};
        int[] b={2,3,9};
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                list.add(a[i]);
                i++;
            }
            else {
                list.add(b[j]);
                j++;
            }
        }
        while (i < a.length){
            list.add(a[i]);
            i++;
        }
        while (j < b.length){
            list.add(b[j]);
            j++;
        }
        for(int z=0;z<a.length;z++){
            a[z]=list.get(z);
        }
        for(int z=0;z<b.length;z++){
            b[z]=list.get(z+a.length);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
