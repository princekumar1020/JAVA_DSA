package Arrays.Easy;

import java.util.Scanner;
// the brute force approach: Sort arr and return last index element
// no better
// optimise is given bellow
public class LargetElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        largest(arr);
    }
    static void largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            if(a > max){
                max=a;
            }
        }
        System.out.println("largest value in arr is : "+max);
    }
}
