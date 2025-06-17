package Arrays.Easy;
// finding missing element from 1 to n
// take care array is not sorted
public class FindMissingNoInRange {
    public static void main(String[] args) {
// Brute force: this sol
        int[] arr={1,2,4,3};
        for(int i=1;i<= arr.length+1;i++){
            boolean flag=false;
            for(int j=0;j< arr.length;j++){
                if(i == arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
                break;
            }
        }
// Better sol: make hash array means visited or not sam like that
    }
}
