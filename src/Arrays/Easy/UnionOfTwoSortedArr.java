package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;
// Brute force: take set first iterate throught first and then second
// array and then update in new array and return it
public class UnionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
// Optimal Approach: two pointer approach
        ArrayList<Integer> temp=new ArrayList<>();
        int i=0,j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                // order matters in this if statement
                if( temp.size() == 0 || temp.get(temp.size()-1) != arr1[i]){
                    temp.add(arr1[i]);
                }
                i++;
            }
            else{
                if(temp.size() == 0 || temp.get(temp.size()-1) != arr2[j]){
                    temp.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < arr1.length){
            if(temp.size() == 0 || temp.get(temp.size()-1) != arr1[i]){
                temp.add(arr1[i]);
            }
            i++;
        }
        while(j < arr2.length){
            if(temp.size() == 0 || temp.get(temp.size()-1) != arr2[j]){
                temp.add(arr2[j]);
            }
            j++;
        }
        for(int a:temp){
            System.out.print(a+" ");
        }
    }
}
