package Arrays.Easy;
// used only optimal not other thing needed
public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        int last=arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=last;
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
