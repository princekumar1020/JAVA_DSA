package Arrays.Medium.LongestConsecutiveSequenceInAnArr;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int n = a.length;

        int longest = 1;
        Set<Integer> set=new HashSet<>();
//        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println(longest);
    }
}
