package Arrays.Easy;
// just simple check sorted in non decending order or not
public class SortedOrNot {
    public static void main(String[] args) {
//        int[] arr={2,3,1,4,7,7,5};
        int[] arr={1,2,3,4,5,6};
        boolean Sorted=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i-1] > arr[i]){
                Sorted=false;
            }
        }
        if(Sorted){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is Not sorted.");
        }
    }
}
