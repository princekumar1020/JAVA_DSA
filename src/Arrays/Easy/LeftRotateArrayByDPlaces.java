package Arrays.Easy;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=3;
        d=d % arr.length;
// Brute Force Approach: just take temp array and add element from 0 till
//d in it and then run loop from d to n and put element from position i
// to i-d and then add temp array  at last from n-d position
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i< arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int j= arr.length-d;j< arr.length;j++){
            arr[j]=temp[j-(arr.length-d)];
        }

// Better Approach : just same approach in above question but for d time

//        for (int i=1;i<=d;i++){
//            int temp=arr[0];
//            for(int j=1;j< arr.length;j++){
//                arr[j-1]=arr[j];
//            }
//            arr[arr.length-1]=temp;
//        }

// Optimal approach :
//        reverse(arr,0,d-1);
//        reverse(arr,d, arr.length-1);
//        reverse(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void reverse(int[] arr,int s,int e){
        for(int i=s,j=e;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
