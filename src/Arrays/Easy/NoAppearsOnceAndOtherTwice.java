package Arrays.Easy;

public class NoAppearsOnceAndOtherTwice {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
// Brutefoce :take each element and check if it exist in array two time
// and if any element find which count is one then print that
//        for(int i=0;i< arr.length;i++){
//            int count=0;
//            for(int j=0;j< arr.length;j++){
//                if(arr[i] == arr[j]) count++;
//            }
//            if(count == 1){
//                System.out.println(arr[i]);
//                break;
//            }
//        }

// Better : take a array which of size max range of element and update
// count by traversing in arr in it and then again trivers in it and
// if we find any no with only count 1 in that arr then print
//        int max=arr[0];
//        for(int a:arr){
//            if(a > max) max=a;
//        }
//        int[] bucket=new int[max+1];
//        for(int a:arr){
//            bucket[a]++;
//        }
//        for(int j=0;j<bucket.length;j++){
//            if(bucket[j] == 1){
//                System.out.println(j);
//                break;
//            }
//        }

// Optimal approach : xor all element of array then the xor actual is ans
         int xor=0;
         for(int a:arr){
             xor^=a;
         }
        System.out.println(xor);
    }
}
