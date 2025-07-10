package Arrays.Hard.PascalTriangle.SecondProblem;

public class Optimalsol {
    public static void main(String[] args) {
        int n=5;
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<5;i++){
            ans=ans*(5-i);
            ans=ans/(i);
            System.out.print(ans+" ");
        }
    }
}
