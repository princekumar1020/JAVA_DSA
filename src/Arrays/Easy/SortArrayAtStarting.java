package Arrays.Easy;

//Problem Statement: Given an integer array sorted in non-decreasing
// order, remove the duplicates in place such that each unique element
// appears only once. The relative order of the elements should be kept
// the same.
//If there are k elements after removing the duplicates, then the first
// k elements of the array should hold the final result. It does not
// matter what you leave beyond the first k elements.
//Note: Return k after placing the final result in the first k slots of
// the array.
//brute force: take HashSet and the again update array
//because set only
//optimal:using two pointer approach
public class SortArrayAtStarting {
    public static void main(String[] args) {
// Brute force approach first :
//        HashSet<Integer> set=new HashSet<>();
        int[] arr={1,1,2,2,2,3,3};
//        for(int a:arr){
//            set.add(a);
//        }
//        int i=0;
//        for(int j:set){
//            arr[i++]=j;
//        }
//        System.out.println(set.size());

// Optimal approach now :just think is we put two pointer i at first
//and j at second and if j is not equal to i only then swap and i++,j++
// other wise j++
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j] != arr[i]){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println(i+1);
    }
}
