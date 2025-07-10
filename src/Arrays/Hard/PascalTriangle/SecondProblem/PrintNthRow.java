package Arrays.Hard.PascalTriangle.SecondProblem;
// tc:o(n*r) so we have to optimise
public class PrintNthRow {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++){
            findelement(5-1,i);
        }

    }
    static void findelement(int n,int r){
        long fact=1;
        for(int i=0;i<r;i++){
            fact=fact*(n-i);
            fact=fact/(i+1);
        }
        System.out.println(fact);
    }
}
