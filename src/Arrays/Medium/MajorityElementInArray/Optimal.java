package Arrays.Medium.MajorityElementInArray;

public class Optimal {
    public static void main(String[] args) {
//         Boyer-Moore Voting Algorithm
        // count ko zero sa nicha nhi jana dena
        int[] arr={2,2,3,3,1,2,2};
        int candidate=0;
        int count=0;
        for(int i=1;i< arr.length;i++){
            if(count == 0){
                count=1;
                candidate=arr[i];
            } else if (candidate == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        int c=0;
        for(int a:arr){
            if(a == candidate) c++;
        }
        if(c > (arr.length/2)){
            System.out.println(candidate);
        }
        else {
            System.out.println("not find");
        }
    }
}
