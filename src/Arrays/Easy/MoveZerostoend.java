package Arrays.Easy;

//Problem Statement: You are given an array of integers, your task is
// to move all the zeros in the array to the end of the array and move
// non-negative integers to the front by maintaining their order.
// ans : agar asa question ae jis ma oder maintain rakhna ha then wwe
// have to use two pointer one readers and one writes optimal
public class MoveZerostoend {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
//        int[] arr={1,2,0,1,0,4,0};
// my own approach but not maintaining order so not correct
//        int i=0;
//        int j= arr.length-1;
//        while(i<j){
//            if(arr[i] != 0 && arr[j] !=0){
//                i++;
//            } else if (arr[i] ==0 && arr[j]==0) {
//                j--;
//            } else if (arr[i] == 0 && arr[j] != 0) {
//                arr[i]=arr[j];
//                arr[j]=0;
//            }
//            else{
//                j--;
//                i++;
//            }
//        }

// Brute Force: just make new temp array and insert non zero in it and
// then and insert this temp in starting of original arr and then left
// one  index with zeros
//        ArrayList<Integer> temp=new ArrayList<>();
//        for(int a:arr){
//            if(a != 0) temp.add(a);
//        }
//        for(int i=0;i< temp.size();i++){
//            arr[i]=temp.get(i);
//        }
//        for(int i=temp.size();i< arr.length;i++){
//            arr[i]=0;
//        }

// Optimal Approach : two pointer approach one reader and one writter
// put i pointer first 0 in arr and j just next to it swap both if j is
// non zero and i++ and j++ other wise loop will inc j ,
        int i=-1;
        for(int j=0;j< arr.length;j++){
            if(arr[j] == 0){
                i=j;
                break;
            }
        }
        for(int j=i+1;j< arr.length;j++){
            if(arr[j] != 0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
