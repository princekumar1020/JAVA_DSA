package Arrays.Hard.PascalTriangle.FirstProblem;
// we have given a row and column we have to find element in a pascal
// triangle
public class FindNo {
    public static void main(String[] args) {
// 1             1
// 2           1   1
// 3        1   2   1
// 4       1   3   3   1
// 5     1   4   6   4   1
// 6   1   5   10  10   5  1
// solution is :
        // nCr = n!/r! * (n-r)!  : combination
// here we do some smart work we dont compute each factorial everytime
// we just compute n! upto the place of r like n=7 and r=2 so we just
// compute n upto 7*6/2*1 thata it other one get cancel out like :-
// 5*4*3*2*1 / 5*4*3*2*1 get cancle out
// compute in sense like:  7  x  6
//                         1     2
        int n=5;
        int r=3;
        findelement(5-1,3-1);
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
