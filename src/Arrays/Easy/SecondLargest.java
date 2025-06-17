package Arrays.Easy;

// brute force: sort arr and then triverse rerverse in arr if we get
// element which is not equal to max then that is second largest then
// return it : o(nlogn) + o(n) ~ o(nlogn).
//better : first triverse one and find first largest then again triverse
//update seclargest if it is max then previous and not equal to first
// largest : o(2*n) ~ o(n).
//optimal is writen bellow : o(n). learn :- SLM small,large,medium
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,7,7,5};
        int firstmax=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int a:arr){
            if(a > firstmax){
                secmax=firstmax;
                firstmax=a;
            } else if (a > secmax && a != firstmax) {
                secmax=a;
            }
        }
        System.out.println("first largest is : "+firstmax);
        System.out.println("Second largest is : "+secmax);
    }
}
