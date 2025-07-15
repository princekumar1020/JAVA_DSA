package Arrays.Hard.FindOneMissingAndOneRepeatingElement;
// Approach sum of array and sum of 1 to n
// sum of square of array and sumof square of n
// sumof n= n*(n+1)/2;
// sum of square of n =n*(n+1)*(2*n+1)/6;
public class Optimal1 {
    public static void main(String[] args) {
        // x is repeating and y is missing
        int[] a={4,3,6,2,1,1};
        long n = a.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        System.out.println(x);
        System.out.println(y);
    }
}
